package com.dbcompare.service.impl;

import com.dbcompare.config.DatabaseConfig;
import com.dbcompare.enums.DatabaseObjectType;
import com.dbcompare.model.DatabaseObject;
import com.dbcompare.service.DatabaseMetadataExtractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.*;

/**
 * SQL Server database metadata extractor implementation
 */
public class SQLServerMetadataExtractor implements DatabaseMetadataExtractor {
    
    private static final Logger logger = LoggerFactory.getLogger(SQLServerMetadataExtractor.class);

    @Override
    public List<DatabaseObject> extractObjects(DatabaseConfig config, Set<DatabaseObjectType> objectTypes) 
            throws SQLException {
        List<DatabaseObject> objects = new ArrayList<>();
        
        try (Connection connection = getConnection(config)) {
            String schema = config.getSchema();
            if (schema == null || schema.isEmpty()) {
                schema = "dbo"; // Default schema for SQL Server
            }

            for (DatabaseObjectType type : objectTypes) {
                objects.addAll(extractObjectsByType(connection, schema, type));
            }
        }
        
        return objects;
    }

    private List<DatabaseObject> extractObjectsByType(Connection connection, String schema, 
                                                     DatabaseObjectType type) throws SQLException {
        List<DatabaseObject> objects = new ArrayList<>();
        
        switch (type) {
            case TABLE:
                objects.addAll(extractTables(connection, schema));
                break;
            case VIEW:
                objects.addAll(extractViews(connection, schema));
                break;
            case PROCEDURE:
                objects.addAll(extractProcedures(connection, schema));
                break;
            case FUNCTION:
                objects.addAll(extractFunctions(connection, schema));
                break;
            case TRIGGER:
                objects.addAll(extractTriggers(connection, schema));
                break;
            case INDEX:
                objects.addAll(extractIndexes(connection, schema));
                break;
            default:
                logger.warn("SQL Server不支持对象类型 {}", type);
        }
        
        return objects;
    }

    private List<DatabaseObject> extractTables(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> tables = new ArrayList<>();
        
        String sql = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES " +
                    "WHERE TABLE_SCHEMA = ? AND TABLE_TYPE = 'BASE TABLE'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject table = new DatabaseObject();
                    table.setSchema(schema);
                    table.setName(rs.getString("TABLE_NAME"));
                    table.setType(DatabaseObjectType.TABLE);
                    tables.add(table);
                }
            }
        }
        
        return tables;
    }

    private List<DatabaseObject> extractViews(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> views = new ArrayList<>();
        
        String sql = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.VIEWS WHERE TABLE_SCHEMA = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject view = new DatabaseObject();
                    view.setSchema(schema);
                    view.setName(rs.getString("TABLE_NAME"));
                    view.setType(DatabaseObjectType.VIEW);
                    views.add(view);
                }
            }
        }
        
        return views;
    }

    private List<DatabaseObject> extractProcedures(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> procedures = new ArrayList<>();
        
        String sql = "SELECT ROUTINE_NAME FROM INFORMATION_SCHEMA.ROUTINES " +
                    "WHERE ROUTINE_SCHEMA = ? AND ROUTINE_TYPE = 'PROCEDURE'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject procedure = new DatabaseObject();
                    procedure.setSchema(schema);
                    procedure.setName(rs.getString("ROUTINE_NAME"));
                    procedure.setType(DatabaseObjectType.PROCEDURE);
                    procedures.add(procedure);
                }
            }
        }
        
        return procedures;
    }

    private List<DatabaseObject> extractFunctions(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> functions = new ArrayList<>();
        
        String sql = "SELECT ROUTINE_NAME FROM INFORMATION_SCHEMA.ROUTINES " +
                    "WHERE ROUTINE_SCHEMA = ? AND ROUTINE_TYPE = 'FUNCTION'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject function = new DatabaseObject();
                    function.setSchema(schema);
                    function.setName(rs.getString("ROUTINE_NAME"));
                    function.setType(DatabaseObjectType.FUNCTION);
                    functions.add(function);
                }
            }
        }
        
        return functions;
    }

    private List<DatabaseObject> extractTriggers(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> triggers = new ArrayList<>();
        
        String sql = "SELECT t.name AS trigger_name " +
                    "FROM sys.triggers t " +
                    "INNER JOIN sys.tables tb ON t.parent_id = tb.object_id " +
                    "INNER JOIN sys.schemas s ON tb.schema_id = s.schema_id " +
                    "WHERE s.name = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject trigger = new DatabaseObject();
                    trigger.setSchema(schema);
                    trigger.setName(rs.getString("trigger_name"));
                    trigger.setType(DatabaseObjectType.TRIGGER);
                    triggers.add(trigger);
                }
            }
        }
        
        return triggers;
    }

    private List<DatabaseObject> extractIndexes(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> indexes = new ArrayList<>();
        
        String sql = "SELECT i.name AS index_name, t.name AS table_name " +
                    "FROM sys.indexes i " +
                    "INNER JOIN sys.tables t ON i.object_id = t.object_id " +
                    "INNER JOIN sys.schemas s ON t.schema_id = s.schema_id " +
                    "WHERE s.name = ? AND i.type > 0 AND i.is_primary_key = 0 AND i.is_unique_constraint = 0";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject index = new DatabaseObject();
                    index.setSchema(schema);
                    String tableName = rs.getString("table_name");
                    String indexName = rs.getString("index_name");
                    index.setName(tableName + "." + indexName);
                    index.setType(DatabaseObjectType.INDEX);
                    indexes.add(index);
                }
            }
        }
        
        return indexes;
    }

    @Override
    public String getDDL(DatabaseConfig config, DatabaseObject object) throws SQLException {
        try (Connection connection = getConnection(config)) {
            switch (object.getType()) {
                case TABLE:
                    return getTableDDL(connection, object);
                case VIEW:
                    return getViewDDL(connection, object);
                case PROCEDURE:
                case FUNCTION:
                    return getRoutineDDL(connection, object);
                case TRIGGER:
                    return getTriggerDDL(connection, object);
                case INDEX:
                    return getIndexDDL(connection, object);
                default:
                    return "-- SQL Server不支持 " + object.getType() + " 类型的DDL提取";
            }
        }
    }

    private String getTableDDL(Connection connection, DatabaseObject table) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        
        String sql = "SELECT COLUMN_NAME, DATA_TYPE, IS_NULLABLE, COLUMN_DEFAULT, " +
                    "CHARACTER_MAXIMUM_LENGTH, NUMERIC_PRECISION, NUMERIC_SCALE " +
                    "FROM INFORMATION_SCHEMA.COLUMNS " +
                    "WHERE TABLE_SCHEMA = ? AND TABLE_NAME = ? " +
                    "ORDER BY ORDINAL_POSITION";
        
        ddl.append("CREATE TABLE [").append(table.getName()).append("] (\n");
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, table.getSchema());
            stmt.setString(2, table.getName());
            try (ResultSet rs = stmt.executeQuery()) {
                boolean first = true;
                while (rs.next()) {
                    if (!first) ddl.append(",\n");
                    first = false;
                    
                    ddl.append("    [").append(rs.getString("COLUMN_NAME")).append("] ");
                    ddl.append(rs.getString("DATA_TYPE"));
                    
                    String maxLength = rs.getString("CHARACTER_MAXIMUM_LENGTH");
                    if (maxLength != null && !maxLength.equals("-1")) {
                        ddl.append("(").append(maxLength).append(")");
                    }
                    
                    if ("NO".equals(rs.getString("IS_NULLABLE"))) {
                        ddl.append(" NOT NULL");
                    }
                    
                    String defaultValue = rs.getString("COLUMN_DEFAULT");
                    if (defaultValue != null) {
                        ddl.append(" DEFAULT ").append(defaultValue);
                    }
                }
            }
        } catch (SQLException e) {
            logger.warn("无法获取表 {} 的DDL: {}", table.getObjectKey(), e.getMessage());
            ddl.append("-- 无法获取表DDL: ").append(e.getMessage());
        }
        
        ddl.append("\n)");
        return ddl.toString();
    }

    private String getViewDDL(Connection connection, DatabaseObject view) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        
        String sql = "SELECT VIEW_DEFINITION FROM INFORMATION_SCHEMA.VIEWS " +
                    "WHERE TABLE_SCHEMA = ? AND TABLE_NAME = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, view.getSchema());
            stmt.setString(2, view.getName());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append("CREATE VIEW [").append(view.getName()).append("] AS\n");
                    ddl.append(rs.getString("VIEW_DEFINITION"));
                }
            }
        } catch (SQLException e) {
            logger.warn("无法获取视图 {} 的DDL: {}", view.getObjectKey(), e.getMessage());
            ddl.append("-- 无法获取视图DDL: ").append(e.getMessage());
        }
        
        return ddl.toString();
    }

    private String getRoutineDDL(Connection connection, DatabaseObject routine) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        
        String sql = "SELECT ROUTINE_DEFINITION FROM INFORMATION_SCHEMA.ROUTINES " +
                    "WHERE ROUTINE_SCHEMA = ? AND ROUTINE_NAME = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, routine.getSchema());
            stmt.setString(2, routine.getName());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append(rs.getString("ROUTINE_DEFINITION"));
                }
            }
        } catch (SQLException e) {
            logger.warn("无法获取{} {} 的DDL: {}", routine.getType(), routine.getObjectKey(), e.getMessage());
            ddl.append("-- 无法获取").append(routine.getType()).append("DDL: ").append(e.getMessage());
        }
        
        return ddl.toString();
    }

    private String getTriggerDDL(Connection connection, DatabaseObject trigger) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        
        String sql = "SELECT m.definition " +
                    "FROM sys.triggers t " +
                    "INNER JOIN sys.sql_modules m ON t.object_id = m.object_id " +
                    "INNER JOIN sys.tables tb ON t.parent_id = tb.object_id " +
                    "INNER JOIN sys.schemas s ON tb.schema_id = s.schema_id " +
                    "WHERE s.name = ? AND t.name = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, trigger.getSchema());
            stmt.setString(2, trigger.getName());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append(rs.getString("definition"));
                }
            }
        } catch (SQLException e) {
            logger.warn("无法获取触发器 {} 的DDL: {}", trigger.getObjectKey(), e.getMessage());
            ddl.append("-- 无法获取触发器DDL: ").append(e.getMessage());
        }
        
        return ddl.toString();
    }

    private String getIndexDDL(Connection connection, DatabaseObject index) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        String[] parts = index.getName().split("\\.", 2);
        if (parts.length == 2) {
            String tableName = parts[0];
            String indexName = parts[1];
            
            // Get basic index information
            String sql = "SELECT i.name, i.type_desc, i.is_unique, i.object_id " +
                        "FROM sys.indexes i " +
                        "INNER JOIN sys.tables t ON i.object_id = t.object_id " +
                        "INNER JOIN sys.schemas s ON t.schema_id = s.schema_id " +
                        "WHERE s.name = ? AND t.name = ? AND i.name = ?";
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, index.getSchema());
                stmt.setString(2, tableName);
                stmt.setString(3, indexName);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        int objectId = rs.getInt("object_id");
                        boolean isUnique = rs.getBoolean("is_unique");
                        
                        ddl.append("CREATE ");
                        if (isUnique) {
                            ddl.append("UNIQUE ");
                        }
                        ddl.append("INDEX [").append(indexName).append("] ON [").append(tableName).append("]");
                        
                        // Get index columns
                        String columnsSql = "SELECT c.name, ic.is_descending_key " +
                                          "FROM sys.index_columns ic " +
                                          "INNER JOIN sys.columns c ON ic.object_id = c.object_id AND ic.column_id = c.column_id " +
                                          "WHERE ic.object_id = ? AND ic.index_id = " +
                                          "(SELECT index_id FROM sys.indexes WHERE object_id = ? AND name = ?) " +
                                          "ORDER BY ic.key_ordinal";
                        
                        try (PreparedStatement colStmt = connection.prepareStatement(columnsSql)) {
                            colStmt.setInt(1, objectId);
                            colStmt.setInt(2, objectId);
                            colStmt.setString(3, indexName);
                            try (ResultSet colRs = colStmt.executeQuery()) {
                                List<String> columns = new ArrayList<>();
                                while (colRs.next()) {
                                    String columnName = colRs.getString("name");
                                    boolean isDesc = colRs.getBoolean("is_descending_key");
                                    columns.add("[" + columnName + "]" + (isDesc ? " DESC" : ""));
                                }
                                
                                if (!columns.isEmpty()) {
                                    ddl.append(" (").append(String.join(", ", columns)).append(")");
                                }
                            }
                        }
                    }
                }
            } catch (SQLException e) {
                logger.warn("无法获取索引 {} 的DDL: {}", index.getObjectKey(), e.getMessage());
                ddl.append("-- 无法获取索引DDL: ").append(e.getMessage());
            }
        } else {
            ddl.append("-- 索引名格式错误: ").append(index.getName());
        }
        
        return ddl.toString();
    }

    @Override
    public boolean testConnection(DatabaseConfig config) {
        try (Connection connection = getConnection(config)) {
            return connection != null && !connection.isClosed();
        } catch (Exception e) {
            logger.error("SQL Server数据库连接测试失败: {}", e.getMessage());
            return false;
        }
    }

    @Override
    public String getSupportedDatabaseType() {
        return "SQLSERVER";
    }

    private Connection getConnection(DatabaseConfig config) throws SQLException {
        return DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    }
}