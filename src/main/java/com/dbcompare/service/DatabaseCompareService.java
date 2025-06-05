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
        
        logger.info("Starting database comparison between {} and {}", 
                   sourceConfig.getType(), targetConfig.getType());

        // Validate database configurations
        validateConfigurations(sourceConfig, targetConfig);
        
        // Determine object types to compare
        Set<DatabaseObjectType> objectTypes = determineObjectTypes(includeTypes, excludeTypes);
        
        // Extract objects from both databases
        logger.info("Extracting objects from source database...");
        List<DatabaseObject> sourceObjects = extractObjects(sourceConfig, objectTypes);
        
        logger.info("Extracting objects from target database...");
        List<DatabaseObject> targetObjects = extractObjects(targetConfig, objectTypes);
        
        // Extract DDL for all objects
        logger.info("Extracting DDL definitions...");
        enrichWithDDL(sourceConfig, sourceObjects);
        enrichWithDDL(targetConfig, targetObjects);
        
        // Perform comparison
        logger.info("Comparing database objects...");
        ComparisonResult result = performComparison(sourceObjects, targetObjects, 
                                                   sourceConfig, targetConfig);
        
        // Generate and save report
        logger.info("Generating comparison report...");
        generateReport(result, outputFile, outputFormat, verbose);
        
        // Print summary
        printSummary(result);
    }

    private void validateConfigurations(DatabaseConfig sourceConfig, DatabaseConfig targetConfig) 
            throws Exception {
        
        DatabaseMetadataExtractor sourceExtractor = getExtractor(sourceConfig.getType());
        DatabaseMetadataExtractor targetExtractor = getExtractor(targetConfig.getType());
        
        if (!sourceExtractor.testConnection(sourceConfig)) {
            throw new Exception("Cannot connect to source database: " + sourceConfig);
        }
        
        if (!targetExtractor.testConnection(targetConfig)) {
            throw new Exception("Cannot connect to target database: " + targetConfig);
        }
        
        logger.info("Database connections validated successfully");
    }

    private Set<DatabaseObjectType> determineObjectTypes(String[] includeTypes, String[] excludeTypes) {
        Set<DatabaseObjectType> objectTypes = new HashSet<>();
        
        if (includeTypes != null && includeTypes.length > 0) {
            // Include only specified types
            for (String type : includeTypes) {
                try {
                    objectTypes.add(DatabaseObjectType.fromString(type.trim()));
                } catch (IllegalArgumentException e) {
                    logger.warn("Unknown object type: {}", type);
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
                    logger.warn("Unknown object type: {}", type);
                }
            }
        }
        
        logger.info("Comparing object types: {}", objectTypes);
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
                logger.warn("Failed to get DDL for {}: {}", object.getObjectKey(), e.getMessage());
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
        Map<String, DatabaseObject> sourceMap = sourceObjects.stream()
                .collect(Collectors.toMap(DatabaseObject::getObjectKey, obj -> obj));
        Map<String, DatabaseObject> targetMap = targetObjects.stream()
                .collect(Collectors.toMap(DatabaseObject::getObjectKey, obj -> obj));
        
        // Count objects by type
        result.setSourceObjectCounts(countObjectsByType(sourceObjects));
        result.setTargetObjectCounts(countObjectsByType(targetObjects));
        
        // Find objects that exist only in source
        for (DatabaseObject sourceObj : sourceObjects) {
            if (!targetMap.containsKey(sourceObj.getObjectKey())) {
                result.getSourceOnlyObjects().add(sourceObj);
            }
        }
        
        // Find objects that exist only in target
        for (DatabaseObject targetObj : targetObjects) {
            if (!sourceMap.containsKey(targetObj.getObjectKey())) {
                result.getTargetOnlyObjects().add(targetObj);
            }
        }
        
        // Compare objects that exist in both databases
        for (DatabaseObject sourceObj : sourceObjects) {
            DatabaseObject targetObj = targetMap.get(sourceObj.getObjectKey());
            if (targetObj != null) {
                if (areDDLsEqual(sourceObj.getDdl(), targetObj.getDdl())) {
                    result.getIdenticalObjects().add(sourceObj);
                } else {
                    result.getDifferentObjects().add(sourceObj);
                    
                    // Create difference record
                    ComparisonResult.ObjectDifference diff = new ComparisonResult.ObjectDifference(
                            sourceObj, targetObj, "DDL_DIFFERENT", "DDL structures are different");
                    result.getDifferences().add(diff);
                }
            }
        }
        
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
            throw new IllegalArgumentException("Unsupported database type: " + databaseType);
        }
        return extractor;
    }

    private void printSummary(ComparisonResult result) {
        System.out.println("\n=== Database Comparison Summary ===");
        System.out.println("Comparison Time: " + result.getComparisonTime());
        System.out.println("Source Database: " + result.getSourceDatabase());
        System.out.println("Target Database: " + result.getTargetDatabase());
        System.out.println();
        
        System.out.println("Object Counts:");
        for (DatabaseObjectType type : DatabaseObjectType.values()) {
            int sourceCount = result.getSourceObjectCounts().getOrDefault(type, 0);
            int targetCount = result.getTargetObjectCounts().getOrDefault(type, 0);
            if (sourceCount > 0 || targetCount > 0) {
                System.out.printf("  %-12s: Source=%d, Target=%d%n", 
                                type, sourceCount, targetCount);
            }
        }
        
        System.out.println();
        System.out.println("Comparison Results:");
        System.out.println("  Identical Objects: " + result.getIdenticalObjects().size());
        System.out.println("  Different Objects: " + result.getDifferentObjects().size());
        System.out.println("  Source Only: " + result.getSourceOnlyObjects().size());
        System.out.println("  Target Only: " + result.getTargetOnlyObjects().size());
        System.out.println("  Total Differences: " + result.getTotalDifferences());
        
        if (result.hasDifferences()) {
            System.out.println("\nDatabases have differences!");
        } else {
            System.out.println("\nDatabases are identical!");
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
                logger.info("Report saved to: {}", outputFile);
            }
        } catch (Exception e) {
            logger.error("Failed to generate report: {}", e.getMessage(), e);
        }
    }

    private void generateTextReport(ComparisonResult result, String outputFile, boolean verbose) {
        // For now, just create a simple text report
        try (java.io.PrintWriter writer = new java.io.PrintWriter(outputFile)) {
            writer.println("=== Database Comparison Report ===");
            writer.println("Generated at: " + result.getComparisonTime());
            writer.println("Source: " + result.getSourceDatabase());
            writer.println("Target: " + result.getTargetDatabase());
            writer.println();
            
            writer.println("Summary:");
            writer.println("- Identical Objects: " + result.getIdenticalObjects().size());
            writer.println("- Different Objects: " + result.getDifferentObjects().size());
            writer.println("- Source Only Objects: " + result.getSourceOnlyObjects().size());
            writer.println("- Target Only Objects: " + result.getTargetOnlyObjects().size());
            writer.println();
            
            if (verbose) {
                if (!result.getSourceOnlyObjects().isEmpty()) {
                    writer.println("Objects only in source:");
                    for (DatabaseObject obj : result.getSourceOnlyObjects()) {
                        writer.println("  " + obj.getObjectKey());
                    }
                    writer.println();
                }
                
                if (!result.getTargetOnlyObjects().isEmpty()) {
                    writer.println("Objects only in target:");
                    for (DatabaseObject obj : result.getTargetOnlyObjects()) {
                        writer.println("  " + obj.getObjectKey());
                    }
                    writer.println();
                }
                
                if (!result.getDifferentObjects().isEmpty()) {
                    writer.println("Objects with different DDL:");
                    for (DatabaseObject obj : result.getDifferentObjects()) {
                        writer.println("  " + obj.getObjectKey());
                    }
                }
            }
            
        } catch (java.io.IOException e) {
            logger.error("Failed to write text report: {}", e.getMessage());
        }
    }

    private void generateJsonReport(ComparisonResult result, String outputFile, boolean verbose) {
        // Simple JSON generation - in a real implementation, you'd use Jackson
        logger.info("JSON report generation not fully implemented yet. Using text format.");
        generateTextReport(result, outputFile.replace(".json", ".txt"), verbose);
    }

    private void generateHtmlReport(ComparisonResult result, String outputFile, boolean verbose) {
        // Simple HTML generation
        try (java.io.PrintWriter writer = new java.io.PrintWriter(outputFile)) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html><head><title>Database Comparison Report</title>");
            writer.println("<style>body{font-family:Arial,sans-serif;margin:20px;}");
            writer.println("table{border-collapse:collapse;width:100%;}");
            writer.println("th,td{border:1px solid #ddd;padding:8px;text-align:left;}");
            writer.println("th{background-color:#f2f2f2;}</style></head><body>");
            
            writer.println("<h1>Database Comparison Report</h1>");
            writer.println("<p><strong>Generated:</strong> " + result.getComparisonTime() + "</p>");
            writer.println("<p><strong>Source:</strong> " + result.getSourceDatabase() + "</p>");
            writer.println("<p><strong>Target:</strong> " + result.getTargetDatabase() + "</p>");
            
            writer.println("<h2>Summary</h2>");
            writer.println("<ul>");
            writer.println("<li>Identical Objects: " + result.getIdenticalObjects().size() + "</li>");
            writer.println("<li>Different Objects: " + result.getDifferentObjects().size() + "</li>");
            writer.println("<li>Source Only Objects: " + result.getSourceOnlyObjects().size() + "</li>");
            writer.println("<li>Target Only Objects: " + result.getTargetOnlyObjects().size() + "</li>");
            writer.println("</ul>");
            
            if (verbose) {
                if (!result.getSourceOnlyObjects().isEmpty()) {
                    writer.println("<h3>Objects Only in Source</h3><ul>");
                    for (DatabaseObject obj : result.getSourceOnlyObjects()) {
                        writer.println("<li>" + obj.getObjectKey() + "</li>");
                    }
                    writer.println("</ul>");
                }
                
                if (!result.getTargetOnlyObjects().isEmpty()) {
                    writer.println("<h3>Objects Only in Target</h3><ul>");
                    for (DatabaseObject obj : result.getTargetOnlyObjects()) {
                        writer.println("<li>" + obj.getObjectKey() + "</li>");
                    }
                    writer.println("</ul>");
                }
                
                if (!result.getDifferentObjects().isEmpty()) {
                    writer.println("<h3>Objects with Different DDL</h3><ul>");
                    for (DatabaseObject obj : result.getDifferentObjects()) {
                        writer.println("<li>" + obj.getObjectKey() + "</li>");
                    }
                    writer.println("</ul>");
                }
            }
            
            writer.println("</body></html>");
            
        } catch (java.io.IOException e) {
            logger.error("Failed to write HTML report: {}", e.getMessage());
        }
    }
} 