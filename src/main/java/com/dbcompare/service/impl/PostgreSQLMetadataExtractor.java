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
 * PostgreSQL database metadata extractor implementation
 */
public class PostgreSQLMetadataExtractor implements DatabaseMetadataExtractor {
    
    private static final Logger logger = LoggerFactory.getLogger(PostgreSQLMetadataExtractor.class);

    @Override
    public List<DatabaseObject> extractObjects(DatabaseConfig config, Set<DatabaseObjectType> objectTypes) 
            throws SQLException {
        List<DatabaseObject> objects = new ArrayList<>();
        
        try (Connection connection = getConnection(config)) {
            String schema = config.getSchema();
            if (schema == null || schema.isEmpty()) {
                schema = "public"; // Default schema for PostgreSQL
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
                logger.warn("PostgreSQL不支持对象类型 {}", type);
        }
        
        return objects;
    }

    private List<DatabaseObject> extractTables(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> tables = new ArrayList<>();
        
        String sql = "SELECT table_name FROM information_schema.tables " +
                    "WHERE table_schema = ? AND table_type = 'BASE TABLE'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject table = new DatabaseObject();
                    table.setSchema(schema);
                    table.setName(rs.getString("table_name"));
                    table.setType(DatabaseObjectType.TABLE);
                    tables.add(table);
                }
            }
        }
        
        return tables;
    }

    private List<DatabaseObject> extractViews(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> views = new ArrayList<>();
        
        String sql = "SELECT table_name FROM information_schema.views WHERE table_schema = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject view = new DatabaseObject();
                    view.setSchema(schema);
                    view.setName(rs.getString("table_name"));
                    view.setType(DatabaseObjectType.VIEW);
                    views.add(view);
                }
            }
        }
        
        return views;
    }

    private List<DatabaseObject> extractProcedures(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> procedures = new ArrayList<>();
        
        String sql = "SELECT routine_name FROM information_schema.routines " +
                    "WHERE routine_schema = ? AND routine_type = 'PROCEDURE'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject procedure = new DatabaseObject();
                    procedure.setSchema(schema);
                    procedure.setName(rs.getString("routine_name"));
                    procedure.setType(DatabaseObjectType.PROCEDURE);
                    procedures.add(procedure);
                }
            }
        }
        
        return procedures;
    }

    private List<DatabaseObject> extractFunctions(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> functions = new ArrayList<>();
        
        String sql = "SELECT routine_name FROM information_schema.routines " +
                    "WHERE routine_schema = ? AND routine_type = 'FUNCTION'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject function = new DatabaseObject();
                    function.setSchema(schema);
                    function.setName(rs.getString("routine_name"));
                    function.setType(DatabaseObjectType.FUNCTION);
                    functions.add(function);
                }
            }
        }
        
        return functions;
    }

    private List<DatabaseObject> extractTriggers(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> triggers = new ArrayList<>();
        
        String sql = "SELECT trigger_name FROM information_schema.triggers " +
                    "WHERE trigger_schema = ?";
        
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
        
        String sql = "SELECT i.indexname, i.tablename " +
                    "FROM pg_indexes i " +
                    "WHERE i.schemaname = ? AND i.indexname NOT LIKE '%_pkey'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject index = new DatabaseObject();
                    index.setSchema(schema);
                    String tableName = rs.getString("tablename");
                    String indexName = rs.getString("indexname");
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
                    return "-- PostgreSQL不支持 " + object.getType() + " 类型的DDL提取";
            }
        }
    }

    private String getTableDDL(Connection connection, DatabaseObject table) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        
        String sql = "SELECT column_name, data_type, is_nullable, column_default, " +
                    "character_maximum_length, numeric_precision, numeric_scale " +
                    "FROM information_schema.columns " +
                    "WHERE table_schema = ? AND table_name = ? " +
                    "ORDER BY ordinal_position";
        
        ddl.append("CREATE TABLE ").append(table.getSchema()).append(".").append(table.getName()).append(" (\n");
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, table.getSchema());
            stmt.setString(2, table.getName());
            try (ResultSet rs = stmt.executeQuery()) {
                boolean first = true;
                while (rs.next()) {
                    if (!first) ddl.append(",\n");
                    first = false;
                    
                    ddl.append("    ").append(rs.getString("column_name")).append(" ");
                    ddl.append(rs.getString("data_type"));
                    
                    String maxLength = rs.getString("character_maximum_length");
                    if (maxLength != null) {
                        ddl.append("(").append(maxLength).append(")");
                    }
                    
                    if ("NO".equals(rs.getString("is_nullable"))) {
                        ddl.append(" NOT NULL");
                    }
                    
                    String defaultValue = rs.getString("column_default");
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
        
        String sql = "SELECT view_definition FROM information_schema.views " +
                    "WHERE table_schema = ? AND table_name = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, view.getSchema());
            stmt.setString(2, view.getName());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append("CREATE VIEW ").append(view.getSchema()).append(".")
                       .append(view.getName()).append(" AS\n");
                    ddl.append(rs.getString("view_definition"));
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
        
        String sql = "SELECT routine_definition FROM information_schema.routines " +
                    "WHERE routine_schema = ? AND routine_name = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, routine.getSchema());
            stmt.setString(2, routine.getName());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append(rs.getString("routine_definition"));
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
        
        // PostgreSQL doesn't have a direct way to get trigger DDL via information_schema
        // We need to query pg_trigger and pg_proc tables
        String sql = "SELECT pg_get_triggerdef(t.oid) AS trigger_def " +
                    "FROM pg_trigger t " +
                    "JOIN pg_class c ON t.tgrelid = c.oid " +
                    "JOIN pg_namespace n ON c.relnamespace = n.oid " +
                    "WHERE n.nspname = ? AND t.tgname = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, trigger.getSchema());
            stmt.setString(2, trigger.getName());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append(rs.getString("trigger_def"));
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
            
            String sql = "SELECT pg_get_indexdef(i.indexrelid) AS index_def " +
                        "FROM pg_index i " +
                        "JOIN pg_class c ON i.indexrelid = c.oid " +
                        "JOIN pg_namespace n ON c.relnamespace = n.oid " +
                        "WHERE n.nspname = ? AND c.relname = ?";
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, index.getSchema());
                stmt.setString(2, indexName);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        ddl.append(rs.getString("index_def"));
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
            logger.error("PostgreSQL数据库连接测试失败: {}", e.getMessage());
            return false;
        }
    }

    @Override
    public String getSupportedDatabaseType() {
        return "POSTGRESQL";
    }

    private Connection getConnection(DatabaseConfig config) throws SQLException {
        return DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    }
}