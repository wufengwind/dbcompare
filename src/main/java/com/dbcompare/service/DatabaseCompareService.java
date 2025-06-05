package com.dbcompare.service;

import com.dbcompare.config.DatabaseConfig;
import com.dbcompare.enums.DatabaseObjectType;
import com.dbcompare.model.ComparisonResult;
import com.dbcompare.model.DatabaseObject;
import com.dbcompare.service.impl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Main service for comparing database schemas
 */
public class DatabaseCompareService {
    
    private static final Logger logger = LoggerFactory.getLogger(DatabaseCompareService.class);
    
    private final Map<String, DatabaseMetadataExtractor> extractors;

    public DatabaseCompareService() {
        this.extractors = initializeExtractors();
    }

    private Map<String, DatabaseMetadataExtractor> initializeExtractors() {
        Map<String, DatabaseMetadataExtractor> extractorMap = new HashMap<>();
        
        // Initialize all database extractors
        extractorMap.put("MYSQL", new MySQLMetadataExtractor());
        // TODO: Add other database extractors
        // extractorMap.put("ORACLE", new OracleMetadataExtractor());
        // extractorMap.put("SQLSERVER", new SQLServerMetadataExtractor());
        // extractorMap.put("POSTGRESQL", new PostgreSQLMetadataExtractor());
        // extractorMap.put("DB2", new DB2MetadataExtractor());
        // extractorMap.put("DM8", new DM8MetadataExtractor());
        
        return extractorMap;
    }

    /**
     * Compare two databases and generate comparison result
     */
    public void compare(DatabaseConfig sourceConfig, DatabaseConfig targetConfig,
                       String[] includeTypes, String[] excludeTypes,
                       String outputFile, String outputFormat, boolean verbose) throws Exception {
        
        logger.info("开始比较数据库 {} 和 {}", 
                   sourceConfig.getType(), targetConfig.getType());

        // Validate database configurations
        validateConfigurations(sourceConfig, targetConfig);
        
        // Determine object types to compare
        Set<DatabaseObjectType> objectTypes = determineObjectTypes(includeTypes, excludeTypes);
        
        // Extract objects from both databases
        logger.info("从源数据库提取对象...");
        List<DatabaseObject> sourceObjects = extractObjects(sourceConfig, objectTypes);
        
        logger.info("从目标数据库提取对象...");
        List<DatabaseObject> targetObjects = extractObjects(targetConfig, objectTypes);
        
        // Extract DDL for all objects
        logger.info("提取DDL定义...");
        enrichWithDDL(sourceConfig, sourceObjects);
        enrichWithDDL(targetConfig, targetObjects);
        
        // Perform comparison
        logger.info("比较数据库对象...");
        ComparisonResult result = performComparison(sourceObjects, targetObjects, 
                                                   sourceConfig, targetConfig);
        
        // Generate and save report
        logger.info("生成比较报告...");
        
        // Auto-generate report with timestamp if no output file specified
        String finalOutputFile = outputFile;
        String finalFormat = outputFormat;
        if (finalOutputFile == null || finalOutputFile.isEmpty()) {
            // Create reports directory if not exists
            java.io.File reportsDir = new java.io.File("reports");
            if (!reportsDir.exists()) {
                reportsDir.mkdirs();
            }
            
            // Generate timestamp-based filename
            String timestamp = java.time.LocalDateTime.now()
                    .format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            finalOutputFile = String.format("reports/db_compare_%s.html", timestamp);
            finalFormat = "HTML";
        }
        
        generateReport(result, finalOutputFile, finalFormat, true); // Always use verbose for detailed reports
        
        // Print summary
        printSummary(result);
    }

    private void validateConfigurations(DatabaseConfig sourceConfig, DatabaseConfig targetConfig) 
            throws Exception {
        
        DatabaseMetadataExtractor sourceExtractor = getExtractor(sourceConfig.getType());
        DatabaseMetadataExtractor targetExtractor = getExtractor(targetConfig.getType());
        
        if (!sourceExtractor.testConnection(sourceConfig)) {
            throw new Exception("无法连接到源数据库: " + sourceConfig);
        }
        
        if (!targetExtractor.testConnection(targetConfig)) {
            throw new Exception("无法连接到目标数据库: " + targetConfig);
        }
        
        logger.info("数据库连接验证成功");
    }

    private Set<DatabaseObjectType> determineObjectTypes(String[] includeTypes, String[] excludeTypes) {
        Set<DatabaseObjectType> objectTypes = new HashSet<>();
        
        if (includeTypes != null && includeTypes.length > 0) {
            // Include only specified types
            for (String type : includeTypes) {
                try {
                    objectTypes.add(DatabaseObjectType.fromString(type.trim()));
                } catch (IllegalArgumentException e) {
                    logger.warn("未知的对象类型: {}", type);
                }
            }
        } else {
            // Include all types by default
            objectTypes.addAll(Arrays.asList(DatabaseObjectType.values()));
        }
        
        if (excludeTypes != null && excludeTypes.length > 0) {
            // Remove excluded types
            for (String type : excludeTypes) {
                try {
                    objectTypes.remove(DatabaseObjectType.fromString(type.trim()));
                } catch (IllegalArgumentException e) {
                    logger.warn("未知的对象类型: {}", type);
                }
            }
        }
        
        logger.info("比较对象类型: {}", objectTypes);
        return objectTypes;
    }

    private List<DatabaseObject> extractObjects(DatabaseConfig config, Set<DatabaseObjectType> objectTypes) 
            throws SQLException {
        DatabaseMetadataExtractor extractor = getExtractor(config.getType());
        return extractor.extractObjects(config, objectTypes);
    }

    private void enrichWithDDL(DatabaseConfig config, List<DatabaseObject> objects) throws SQLException {
        DatabaseMetadataExtractor extractor = getExtractor(config.getType());
        
        System.out.println("正在提取 " + objects.size() + " 个对象的DDL定义...");
        int processed = 0;
        
        for (DatabaseObject object : objects) {
            processed++;
            try {
                System.out.printf("[%d/%d] 提取 %s DDL... ", processed, objects.size(), object.getObjectKey());
                String ddl = extractor.getDDL(config, object);
                object.setDdl(ddl);
                System.out.println("成功");
                
                if (processed % 10 == 0) {
                    System.out.println("已处理 " + processed + "/" + objects.size() + " 个对象");
                }
            } catch (SQLException e) {
                System.out.println("失败: " + e.getMessage());
                logger.warn("获取DDL失败 {}: {}", object.getObjectKey(), e.getMessage());
                object.setDdl("");
            }
        }
        System.out.println("DDL提取完成，成功处理 " + processed + " 个对象");
    }

    private ComparisonResult performComparison(List<DatabaseObject> sourceObjects, 
                                             List<DatabaseObject> targetObjects,
                                             DatabaseConfig sourceConfig, 
                                             DatabaseConfig targetConfig) {
        
        ComparisonResult result = new ComparisonResult();
        result.setSourceDatabase(sourceConfig.toString());
        result.setTargetDatabase(targetConfig.toString());
        
        // Create maps for quick lookup
        Map<String, DatabaseObject> sourceMap = new HashMap<>();
        Map<String, DatabaseObject> targetMap = new HashMap<>();
        
        // Build source map with duplicate key handling
        for (DatabaseObject obj : sourceObjects) {
            String key = obj.getObjectKey();
            if (sourceMap.containsKey(key)) {
                logger.warn("源数据库中发现重复的对象键: {} - 第一个对象: {}, 第二个对象: {}", 
                           key, sourceMap.get(key), obj);
                // 使用更具体的键
                key = key + "_" + System.identityHashCode(obj);
            }
            sourceMap.put(key, obj);
        }
        
        // Build target map with duplicate key handling
        for (DatabaseObject obj : targetObjects) {
            String key = obj.getObjectKey();
            if (targetMap.containsKey(key)) {
                logger.warn("目标数据库中发现重复的对象键: {} - 第一个对象: {}, 第二个对象: {}", 
                           key, targetMap.get(key), obj);
                // 使用更具体的键
                key = key + "_" + System.identityHashCode(obj);
            }
            targetMap.put(key, obj);
        }
        
        // Count objects by type
        result.setSourceObjectCounts(countObjectsByType(sourceObjects));
        result.setTargetObjectCounts(countObjectsByType(targetObjects));
        
        System.out.println("\n=== 详细比较过程 ===");
        
        // Create maps for cross-schema comparison using object name without schema
        Map<String, DatabaseObject> sourceByNameMap = new HashMap<>();
        Map<String, DatabaseObject> targetByNameMap = new HashMap<>();
        
        for (DatabaseObject obj : sourceObjects) {
            String nameKey = obj.getObjectKeyWithoutSchema();
            sourceByNameMap.put(nameKey, obj);
        }
        
        for (DatabaseObject obj : targetObjects) {
            String nameKey = obj.getObjectKeyWithoutSchema();
            targetByNameMap.put(nameKey, obj);
        }
        
        // Find objects that exist only in source
        System.out.println("\n1. 检查仅存在于源数据库的对象...");
        for (DatabaseObject sourceObj : sourceObjects) {
            String nameKey = sourceObj.getObjectKeyWithoutSchema();
            if (!targetByNameMap.containsKey(nameKey)) {
                result.getSourceOnlyObjects().add(sourceObj);
                System.out.println("   [仅源] " + sourceObj.getObjectKey());
            }
        }
        if (result.getSourceOnlyObjects().isEmpty()) {
            System.out.println("   没有发现仅存在于源数据库的对象");
        }
        
        // Find objects that exist only in target  
        System.out.println("\n2. 检查仅存在于目标数据库的对象...");
        for (DatabaseObject targetObj : targetObjects) {
            String nameKey = targetObj.getObjectKeyWithoutSchema();
            if (!sourceByNameMap.containsKey(nameKey)) {
                result.getTargetOnlyObjects().add(targetObj);
                System.out.println("   [仅目标] " + targetObj.getObjectKey());
            }
        }
        if (result.getTargetOnlyObjects().isEmpty()) {
            System.out.println("   没有发现仅存在于目标数据库的对象");
        }
        
        // Compare objects that exist in both databases
        System.out.println("\n3. 比较两个数据库中都存在的对象...");
        int comparedCount = 0;
        for (DatabaseObject sourceObj : sourceObjects) {
            String nameKey = sourceObj.getObjectKeyWithoutSchema();
            DatabaseObject targetObj = targetByNameMap.get(nameKey);
            
            if (targetObj != null) {
                comparedCount++;
                if (areDDLsEqual(sourceObj.getDdl(), targetObj.getDdl())) {
                    result.getIdenticalObjects().add(sourceObj);
                    System.out.println("   [相同] " + nameKey + " (" + sourceObj.getFullName() + " <-> " + targetObj.getFullName() + ")");
                } else {
                    result.getDifferentObjects().add(sourceObj);
                    System.out.println("   [不同] " + nameKey + " (" + sourceObj.getFullName() + " <-> " + targetObj.getFullName() + ") - DDL结构存在差异");
                    
                    // Create difference record
                    ComparisonResult.ObjectDifference diff = new ComparisonResult.ObjectDifference(
                            sourceObj, targetObj, "DDL_DIFFERENT", "DDL结构不同");
                    result.getDifferences().add(diff);
                }
            }
        }
        if (comparedCount == 0) {
            System.out.println("   没有发现两个数据库中都存在的对象");
        }
        
        System.out.println("\n=== 比较详情完成 ===");
        
        return result;
    }

    private Map<DatabaseObjectType, Integer> countObjectsByType(List<DatabaseObject> objects) {
        return objects.stream()
                .collect(Collectors.groupingBy(
                        DatabaseObject::getType, 
                        Collectors.collectingAndThen(Collectors.counting(), Math::toIntExact)));
    }

    private boolean areDDLsEqual(String sourceDDL, String targetDDL) {
        if (sourceDDL == null && targetDDL == null) {
            return true;
        }
        if (sourceDDL == null || targetDDL == null) {
            return false;
        }
        
        // Normalize DDL before comparison
        String normalizedSource = normalizeDDL(sourceDDL);
        String normalizedTarget = normalizeDDL(targetDDL);
        
        return normalizedSource.equals(normalizedTarget);
    }

    private DatabaseMetadataExtractor getExtractor(String databaseType) {
        DatabaseMetadataExtractor extractor = extractors.get(databaseType.toUpperCase());
        if (extractor == null) {
            throw new IllegalArgumentException("不支持的数据库类型: " + databaseType);
        }
        return extractor;
    }

    private void printSummary(ComparisonResult result) {
        System.out.println("\n=== 数据库比较摘要 ===");
        System.out.println("比较时间: " + result.getComparisonTime());
        System.out.println("源数据库: " + result.getSourceDatabase());
        System.out.println("目标数据库: " + result.getTargetDatabase());
        System.out.println();
        
        System.out.println("对象统计:");
        for (DatabaseObjectType type : DatabaseObjectType.values()) {
            int sourceCount = result.getSourceObjectCounts().getOrDefault(type, 0);
            int targetCount = result.getTargetObjectCounts().getOrDefault(type, 0);
            if (sourceCount > 0 || targetCount > 0) {
                System.out.printf("  %-12s: 源=%d, 目标=%d%n", 
                                type, sourceCount, targetCount);
            }
        }
        
        System.out.println();
        System.out.println("比较结果:");
        System.out.println("  相同对象: " + result.getIdenticalObjects().size());
        System.out.println("  不同对象: " + result.getDifferentObjects().size());
        System.out.println("  仅源数据库: " + result.getSourceOnlyObjects().size());
        System.out.println("  仅目标数据库: " + result.getTargetOnlyObjects().size());
        System.out.println("  总差异数: " + result.getTotalDifferences());
        
        if (result.hasDifferences()) {
            System.out.println("\n数据库存在差异！");
        } else {
            System.out.println("\n数据库完全相同！");
        }
    }

    private String normalizeDDL(String ddl) {
        if (ddl == null) return "";
        
        // Basic DDL normalization
        return ddl.replaceAll("\\s+", " ")           // Replace multiple spaces with single space
                  .replaceAll("\\r\\n|\\r|\\n", " ") // Replace line breaks with spaces
                  .trim()                            // Remove leading/trailing spaces
                  .toLowerCase();                    // Convert to lowercase for comparison
    }

    private void generateReport(ComparisonResult result, String outputFile, String outputFormat, boolean verbose) {
        try {
            if (outputFile != null && !outputFile.isEmpty()) {
                System.out.println("正在生成详细比较报告: " + outputFile);
                
                // Generate file report
                if ("JSON".equalsIgnoreCase(outputFormat)) {
                    generateJsonReport(result, outputFile, verbose);
                } else if ("HTML".equalsIgnoreCase(outputFormat)) {
                    generateHtmlReport(result, outputFile, verbose);
                } else {
                    generateTextReport(result, outputFile, verbose);
                }
                
                System.out.println("比较报告已保存到: " + outputFile);
                logger.info("报告已保存到: {}", outputFile);
            }
        } catch (Exception e) {
            System.err.println("生成报告失败: " + e.getMessage());
            logger.error("生成报告失败: {}", e.getMessage(), e);
        }
    }

    private void generateTextReport(ComparisonResult result, String outputFile, boolean verbose) {
        // For now, just create a simple text report
        try (java.io.PrintWriter writer = new java.io.PrintWriter(outputFile)) {
            writer.println("=== 数据库比较报告 ===");
            writer.println("生成时间: " + result.getComparisonTime());
            writer.println("源数据库: " + result.getSourceDatabase());
            writer.println("目标数据库: " + result.getTargetDatabase());
            writer.println();
            
            writer.println("摘要:");
            writer.println("- 相同对象: " + result.getIdenticalObjects().size());
            writer.println("- 不同对象: " + result.getDifferentObjects().size());
            writer.println("- 仅源数据库对象: " + result.getSourceOnlyObjects().size());
            writer.println("- 仅目标数据库对象: " + result.getTargetOnlyObjects().size());
            writer.println();
            
            if (verbose) {
                if (!result.getSourceOnlyObjects().isEmpty()) {
                    writer.println("仅存在于源数据库的对象:");
                    for (DatabaseObject obj : result.getSourceOnlyObjects()) {
                        writer.println("  " + obj.getObjectKey());
                    }
                    writer.println();
                }
                
                if (!result.getTargetOnlyObjects().isEmpty()) {
                    writer.println("仅存在于目标数据库的对象:");
                    for (DatabaseObject obj : result.getTargetOnlyObjects()) {
                        writer.println("  " + obj.getObjectKey());
                    }
                    writer.println();
                }
                
                if (!result.getDifferentObjects().isEmpty()) {
                    writer.println("DDL不同的对象:");
                    for (DatabaseObject obj : result.getDifferentObjects()) {
                        writer.println("  " + obj.getObjectKey());
                    }
                }
            }
            
        } catch (java.io.IOException e) {
            logger.error("写入文本报告失败: {}", e.getMessage());
        }
    }

    private void generateJsonReport(ComparisonResult result, String outputFile, boolean verbose) {
        // Simple JSON generation - in a real implementation, you'd use Jackson
        logger.info("JSON报告生成功能尚未完全实现。使用文本格式。");
        generateTextReport(result, outputFile.replace(".json", ".txt"), verbose);
    }

    private void generateHtmlReport(ComparisonResult result, String outputFile, boolean verbose) {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(outputFile, "UTF-8")) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html><head>");
            writer.println("<meta charset='UTF-8'>");
            writer.println("<title>数据库比较报告</title>");
            writer.println("<style>");
            writer.println("body{font-family:Arial,sans-serif;margin:20px;line-height:1.6;}");
            writer.println("h1{color:#2c3e50;border-bottom:3px solid #3498db;padding-bottom:10px;}");
            writer.println("h2{color:#34495e;margin-top:30px;}");
            writer.println("h3{color:#7f8c8d;margin-top:25px;}");
            writer.println("table{border-collapse:collapse;width:100%;margin:15px 0;}");
            writer.println("th,td{border:1px solid #ddd;padding:12px;text-align:left;vertical-align:top;}");
            writer.println("th{background-color:#f8f9fa;font-weight:bold;}");
            writer.println(".summary{background-color:#e8f5e8;padding:15px;border-radius:5px;margin:20px 0;}");
            writer.println(".source-only{background-color:#fff3cd;padding:10px;border-left:4px solid #ffc107;}");
            writer.println(".target-only{background-color:#d1ecf1;padding:10px;border-left:4px solid #17a2b8;}");
            writer.println(".different{background-color:#f8d7da;padding:10px;border-left:4px solid #dc3545;}");
            writer.println(".same{background-color:#d4edda;padding:10px;border-left:4px solid #28a745;}");
            writer.println(".ddl-block{background-color:#f8f9fa;border:1px solid #e9ecef;padding:10px;margin:10px 0;font-family:monospace;white-space:pre-wrap;max-height:300px;overflow-y:auto;}");
            writer.println(".object-details{margin:20px 0;border:1px solid #dee2e6;border-radius:5px;}");
            writer.println(".object-header{background-color:#f1f3f4;padding:10px;font-weight:bold;border-bottom:1px solid #dee2e6;}");
            writer.println(".object-content{padding:15px;}");
            writer.println(".ddl-comparison{display:flex;gap:20px;margin:15px 0;}");
            writer.println(".ddl-side{flex:1;border:1px solid #e9ecef;border-radius:5px;}");
            writer.println(".ddl-header{padding:10px;font-weight:bold;border-bottom:1px solid #e9ecef;}");
            writer.println(".source-header{background-color:#fff3cd;border-color:#ffc107;}");
            writer.println(".target-header{background-color:#d1ecf1;border-color:#17a2b8;}");
            writer.println(".ddl-content{padding:10px;font-family:monospace;white-space:pre-wrap;line-height:1.4;max-height:400px;overflow-y:auto;}");
            writer.println(".diff-line{margin:0;padding:2px 5px;}");
            writer.println(".diff-added{background-color:#d4edda;border-left:3px solid #28a745;}");
            writer.println(".diff-removed{background-color:#f8d7da;border-left:3px solid #dc3545;}");
            writer.println(".diff-changed{background-color:#fff3cd;border-left:3px solid #ffc107;}");
            writer.println(".diff-same{background-color:#f8f9fa;}");
            writer.println("</style></head><body>");
            
            writer.println("<h1>🔍 数据库结构比较报告</h1>");
            
            writer.println("<div class='summary'>");
            writer.println("<h2>📊 比较概览</h2>");
            writer.println("<p><strong>生成时间:</strong> " + result.getComparisonTime() + "</p>");
            writer.println("<p><strong>源数据库:</strong> " + escapeHtml(result.getSourceDatabase()) + "</p>");
            writer.println("<p><strong>目标数据库:</strong> " + escapeHtml(result.getTargetDatabase()) + "</p>");
            writer.println("</div>");
            
            // 统计信息表格
            writer.println("<h2>📈 对象统计</h2>");
            writer.println("<table>");
            writer.println("<tr><th>对象类型</th><th>源数据库</th><th>目标数据库</th><th>状态</th></tr>");
            for (DatabaseObjectType type : DatabaseObjectType.values()) {
                int sourceCount = result.getSourceObjectCounts().getOrDefault(type, 0);
                int targetCount = result.getTargetObjectCounts().getOrDefault(type, 0);
                if (sourceCount > 0 || targetCount > 0) {
                    String status = sourceCount == targetCount ? "✅ 相等" : "⚠️ 不等";
                    writer.printf("<tr><td>%s</td><td>%d</td><td>%d</td><td>%s</td></tr>%n", 
                                type, sourceCount, targetCount, status);
                }
            }
            writer.println("</table>");
            
            // 比较结果摘要
            writer.println("<h2>🎯 比较结果摘要</h2>");
            writer.println("<table>");
            writer.println("<tr><th>类别</th><th>数量</th><th>说明</th></tr>");
            writer.printf("<tr><td class='same'>相同对象</td><td>%d</td><td>两个数据库中存在且DDL完全相同的对象</td></tr>%n", result.getIdenticalObjects().size());
            writer.printf("<tr><td class='different'>不同对象</td><td>%d</td><td>两个数据库中都存在但DDL结构不同的对象</td></tr>%n", result.getDifferentObjects().size());
            writer.printf("<tr><td class='source-only'>仅源数据库</td><td>%d</td><td>仅存在于源数据库的对象</td></tr>%n", result.getSourceOnlyObjects().size());
            writer.printf("<tr><td class='target-only'>仅目标数据库</td><td>%d</td><td>仅存在于目标数据库的对象</td></tr>%n", result.getTargetOnlyObjects().size());
            writer.println("</table>");
            
            // 详细比较结果
            if (verbose) {
                // 不同的对象（最重要）
                if (!result.getDifferences().isEmpty()) {
                    writer.println("<h2>⚠️ DDL结构不同的对象</h2>");
                    for (ComparisonResult.ObjectDifference diff : result.getDifferences()) {
                        DatabaseObject sourceObj = diff.getSourceObject();
                        DatabaseObject targetObj = diff.getTargetObject();
                        String nameKey = sourceObj.getObjectKeyWithoutSchema();
                        
                        writer.println("<div class='object-details'>");
                        writer.println("<div class='object-header different'>");
                        writer.printf("🔄 %s - DDL结构差异%n", nameKey);
                        writer.println("</div>");
                        writer.println("<div class='object-content'>");
                        
                        String sourceDDL = sourceObj.getDdl();
                        String targetDDL = targetObj.getDdl();
                        
                        // 生成并排DDL比较
                        writer.println("<h4>🔄 DDL结构对比</h4>");
                        writer.println("<div style='margin:10px 0;padding:10px;background:#f8f9fa;border-radius:3px;font-size:0.9em;'>");
                        writer.println("<strong>颜色说明：</strong> ");
                        writer.println("<span style='background:#d4edda;padding:2px 5px;margin:0 5px;border-radius:2px;'>✅ 相同内容</span> ");
                        writer.println("<span style='background:#f8d7da;padding:2px 5px;margin:0 5px;border-radius:2px;'>❌ 删除/缺失</span> ");
                        writer.println("<span style='background:#d4edda;padding:2px 5px;margin:0 5px;border-radius:2px;'>➕ 新增</span> ");
                        writer.println("<span style='background:#fff3cd;padding:2px 5px;margin:0 5px;border-radius:2px;'>🔄 修改</span>");
                        writer.println("</div>");
                        writer.println("<div class='ddl-comparison'>");
                        writer.println("<div class='ddl-side'>");
                        writer.println("<div class='ddl-header source-header'>📤 源数据库 (" + sourceObj.getFullName() + ")</div>");
                        generateDDLWithDiff(writer, sourceDDL, targetDDL, true);
                        writer.println("</div>");
                        writer.println("<div class='ddl-side'>");
                        writer.println("<div class='ddl-header target-header'>📥 目标数据库 (" + targetObj.getFullName() + ")</div>");
                        generateDDLWithDiff(writer, targetDDL, sourceDDL, false);
                        writer.println("</div>");
                        writer.println("</div>");
                        
                        // 显示差异原因
                        writer.println("<h4>🔍 差异说明</h4>");
                        writer.println("<p><strong>差异类型:</strong> " + diff.getDifferenceType() + "</p>");
                        writer.println("<p><strong>详细说明:</strong> " + diff.getDescription() + "</p>");
                        
                        writer.println("</div></div>");
                    }
                }
                
                // 仅源数据库存在的对象
                if (!result.getSourceOnlyObjects().isEmpty()) {
                    writer.println("<h2>📤 仅存在于源数据库的对象</h2>");
                    for (DatabaseObject obj : result.getSourceOnlyObjects()) {
                        writer.println("<div class='object-details'>");
                        writer.println("<div class='object-header source-only'>");
                        writer.printf("➡️ %s%n", obj.getObjectKeyWithoutSchema());
                        writer.println("</div>");
                        writer.println("<div class='object-content'>");
                        writer.println("<p><strong>对象位置:</strong> " + obj.getFullName() + "</p>");
                        if (obj.getDdl() != null && !obj.getDdl().trim().isEmpty()) {
                            writer.println("<h4>DDL定义</h4>");
                            writer.println("<div class='ddl-block'>" + escapeHtml(obj.getDdl()) + "</div>");
                        }
                        writer.println("</div></div>");
                    }
                }
                
                // 仅目标数据库存在的对象
                if (!result.getTargetOnlyObjects().isEmpty()) {
                    writer.println("<h2>📥 仅存在于目标数据库的对象</h2>");
                    for (DatabaseObject obj : result.getTargetOnlyObjects()) {
                        writer.println("<div class='object-details'>");
                        writer.println("<div class='object-header target-only'>");
                        writer.printf("⬅️ %s%n", obj.getObjectKeyWithoutSchema());
                        writer.println("</div>");
                        writer.println("<div class='object-content'>");
                        writer.println("<p><strong>对象位置:</strong> " + obj.getFullName() + "</p>");
                        if (obj.getDdl() != null && !obj.getDdl().trim().isEmpty()) {
                            writer.println("<h4>DDL定义</h4>");
                            writer.println("<div class='ddl-block'>" + escapeHtml(obj.getDdl()) + "</div>");
                        }
                        writer.println("</div></div>");
                    }
                }
                
                // 相同的对象
                if (!result.getIdenticalObjects().isEmpty()) {
                    writer.println("<h2>✅ 完全相同的对象</h2>");
                    writer.println("<p>以下对象在两个数据库中的DDL结构完全相同：</p>");
                    writer.println("<ul>");
                    for (DatabaseObject obj : result.getIdenticalObjects()) {
                        writer.printf("<li class='same'>%s (%s)</li>%n", 
                                     obj.getObjectKeyWithoutSchema(), obj.getFullName());
                    }
                    writer.println("</ul>");
                }
            }
            
            writer.println("<hr style='margin-top:40px;'>");
            writer.println("<p style='text-align:center;color:#6c757d;'>");
            writer.println("报告生成时间: " + java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            writer.println("</p>");
            
            writer.println("</body></html>");
            
        } catch (java.io.IOException e) {
            logger.error("写入HTML报告失败: {}", e.getMessage());
        }
    }
    
    private String escapeHtml(String text) {
        if (text == null) return "";
        return text.replace("&", "&amp;")
                   .replace("<", "&lt;")
                   .replace(">", "&gt;")
                   .replace("\"", "&quot;")
                   .replace("'", "&#x27;");
    }
    
    private void generateDDLWithDiff(java.io.PrintWriter writer, String thisDDL, String otherDDL, boolean isSource) {
        writer.println("<div class='ddl-content'>");
        
        if (thisDDL == null || thisDDL.trim().isEmpty()) {
            writer.println("<div class='diff-line diff-removed'>DDL内容为空或未提取</div>");
            writer.println("</div>");
            return;
        }
        
        if (otherDDL == null || otherDDL.trim().isEmpty()) {
            writer.println("<div class='diff-line diff-added'>" + escapeHtml(thisDDL) + "</div>");
            writer.println("</div>");
            return;
        }
        
        // 简单的逐行比较
        String[] thisLines = thisDDL.split("\\r?\\n");
        String[] otherLines = otherDDL.split("\\r?\\n");
        
        java.util.Set<String> otherLineSet = new java.util.HashSet<>();
        for (String line : otherLines) {
            otherLineSet.add(line.trim());
        }
        
        for (String line : thisLines) {
            String trimmedLine = line.trim();
            if (trimmedLine.isEmpty()) {
                writer.println("<div class='diff-line diff-same'>" + escapeHtml(line) + "</div>");
            } else if (otherLineSet.contains(trimmedLine)) {
                writer.println("<div class='diff-line diff-same'>" + escapeHtml(line) + "</div>");
            } else {
                // 检查是否是部分匹配（可能是修改）
                boolean isPartialMatch = false;
                for (String otherLine : otherLines) {
                    if (isPartialMatch(trimmedLine, otherLine.trim())) {
                        writer.println("<div class='diff-line diff-changed'>" + escapeHtml(line) + "</div>");
                        isPartialMatch = true;
                        break;
                    }
                }
                if (!isPartialMatch) {
                    String diffClass = isSource ? "diff-removed" : "diff-added";
                    writer.println("<div class='diff-line " + diffClass + "'>" + escapeHtml(line) + "</div>");
                }
            }
        }
        
        writer.println("</div>");
    }
    
    private boolean isPartialMatch(String line1, String line2) {
        if (line1.isEmpty() || line2.isEmpty()) return false;
        
        // 简单的相似度检查 - 如果包含相同的关键词或者长度相近
        String[] words1 = line1.toLowerCase().split("\\s+");
        String[] words2 = line2.toLowerCase().split("\\s+");
        
        int commonWords = 0;
        for (String word1 : words1) {
            for (String word2 : words2) {
                if (word1.equals(word2) && word1.length() > 2) { // 忽略短词
                    commonWords++;
                    break;
                }
            }
        }
        
        // 如果有超过30%的公共词汇，认为是部分匹配
        return commonWords > 0 && commonWords >= Math.min(words1.length, words2.length) * 0.3;
    }
} 