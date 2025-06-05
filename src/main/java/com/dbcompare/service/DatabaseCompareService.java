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
        generateReport(result, outputFile, outputFormat, verbose);
        
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
        
        for (DatabaseObject object : objects) {
            try {
                String ddl = extractor.getDDL(config, object);
                object.setDdl(ddl);
            } catch (SQLException e) {
                logger.warn("获取DDL失败 {}: {}", object.getObjectKey(), e.getMessage());
                object.setDdl("");
            }
        }
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
                // Generate file report
                if ("JSON".equalsIgnoreCase(outputFormat)) {
                    generateJsonReport(result, outputFile, verbose);
                } else if ("HTML".equalsIgnoreCase(outputFormat)) {
                    generateHtmlReport(result, outputFile, verbose);
                } else {
                    generateTextReport(result, outputFile, verbose);
                }
                logger.info("报告已保存到: {}", outputFile);
            }
        } catch (Exception e) {
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
        // Simple HTML generation
        try (java.io.PrintWriter writer = new java.io.PrintWriter(outputFile)) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html><head><title>数据库比较报告</title>");
            writer.println("<style>body{font-family:Arial,sans-serif;margin:20px;}");
            writer.println("table{border-collapse:collapse;width:100%;}");
            writer.println("th,td{border:1px solid #ddd;padding:8px;text-align:left;}");
            writer.println("th{background-color:#f2f2f2;}</style></head><body>");
            
            writer.println("<h1>数据库比较报告</h1>");
            writer.println("<p><strong>生成时间:</strong> " + result.getComparisonTime() + "</p>");
            writer.println("<p><strong>源数据库:</strong> " + result.getSourceDatabase() + "</p>");
            writer.println("<p><strong>目标数据库:</strong> " + result.getTargetDatabase() + "</p>");
            
            writer.println("<h2>摘要</h2>");
            writer.println("<ul>");
            writer.println("<li>相同对象: " + result.getIdenticalObjects().size() + "</li>");
            writer.println("<li>不同对象: " + result.getDifferentObjects().size() + "</li>");
            writer.println("<li>仅源数据库对象: " + result.getSourceOnlyObjects().size() + "</li>");
            writer.println("<li>仅目标数据库对象: " + result.getTargetOnlyObjects().size() + "</li>");
            writer.println("</ul>");
            
            if (verbose) {
                if (!result.getSourceOnlyObjects().isEmpty()) {
                    writer.println("<h3>仅存在于源数据库的对象</h3><ul>");
                    for (DatabaseObject obj : result.getSourceOnlyObjects()) {
                        writer.println("<li>" + obj.getObjectKey() + "</li>");
                    }
                    writer.println("</ul>");
                }
                
                if (!result.getTargetOnlyObjects().isEmpty()) {
                    writer.println("<h3>仅存在于目标数据库的对象</h3><ul>");
                    for (DatabaseObject obj : result.getTargetOnlyObjects()) {
                        writer.println("<li>" + obj.getObjectKey() + "</li>");
                    }
                    writer.println("</ul>");
                }
                
                if (!result.getDifferentObjects().isEmpty()) {
                    writer.println("<h3>DDL不同的对象</h3><ul>");
                    for (DatabaseObject obj : result.getDifferentObjects()) {
                        writer.println("<li>" + obj.getObjectKey() + "</li>");
                    }
                    writer.println("</ul>");
                }
            }
            
            writer.println("</body></html>");
            
        } catch (java.io.IOException e) {
            logger.error("写入HTML报告失败: {}", e.getMessage());
        }
    }
} 