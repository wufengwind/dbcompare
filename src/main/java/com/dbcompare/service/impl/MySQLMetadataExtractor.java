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
 * MySQL database metadata extractor implementation
 */
public class MySQLMetadataExtractor implements DatabaseMetadataExtractor {
    
    private static final Logger logger = LoggerFactory.getLogger(MySQLMetadataExtractor.class);

    @Override
    public List<DatabaseObject> extractObjects(DatabaseConfig config, Set<DatabaseObjectType> objectTypes) 
            throws SQLException {
        List<DatabaseObject> objects = new ArrayList<>();
        
        try (Connection connection = getConnection(config)) {
            String schema = config.getSchema();
            if (schema == null || schema.isEmpty()) {
                schema = connection.getCatalog();
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
                logger.warn("MySQL不支持对象类型 {}", type);
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
        
        String sql = "SELECT TRIGGER_NAME FROM INFORMATION_SCHEMA.TRIGGERS WHERE TRIGGER_SCHEMA = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject trigger = new DatabaseObject();
                    trigger.setSchema(schema);
                    trigger.setName(rs.getString("TRIGGER_NAME"));
                    trigger.setType(DatabaseObjectType.TRIGGER);
                    triggers.add(trigger);
                }
            }
        }
        
        return triggers;
    }

    private List<DatabaseObject> extractIndexes(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> indexes = new ArrayList<>();
        
        String sql = "SELECT DISTINCT INDEX_NAME, TABLE_NAME FROM INFORMATION_SCHEMA.STATISTICS " +
                    "WHERE TABLE_SCHEMA = ? AND INDEX_NAME != 'PRIMARY'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject index = new DatabaseObject();
                    index.setSchema(schema);
                    // 使用 "表名.索引名" 的格式来确保唯一性
                    String tableName = rs.getString("TABLE_NAME");
                    String indexName = rs.getString("INDEX_NAME");
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
                    return getRoutineDDL(connection, object, "PROCEDURE");
                case FUNCTION:
                    return getRoutineDDL(connection, object, "FUNCTION");
                case TRIGGER:
                    return getTriggerDDL(connection, object);
                default:
                    return "";
            }
        }
    }

    private String getTableDDL(Connection connection, DatabaseObject table) throws SQLException {
        String sql = "SHOW CREATE TABLE " + table.getFullName();
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getString(2);
            }
        }
        
        return "";
    }

    private String getViewDDL(Connection connection, DatabaseObject view) throws SQLException {
        String sql = "SHOW CREATE VIEW " + view.getFullName();
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getString(2);
            }
        }
        
        return "";
    }

    private String getRoutineDDL(Connection connection, DatabaseObject routine, String routineType) throws SQLException {
        String sql = "SHOW CREATE " + routineType + " " + routine.getFullName();
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getString(3);
            }
        }
        
        return "";
    }

    private String getTriggerDDL(Connection connection, DatabaseObject trigger) throws SQLException {
        String sql = "SHOW CREATE TRIGGER " + trigger.getFullName();
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getString(3);
            }
        }
        
        return "";
    }

    @Override
    public boolean testConnection(DatabaseConfig config) {
        try (Connection connection = getConnection(config)) {
            return connection.isValid(5);
        } catch (SQLException e) {
            logger.error("连接测试失败: {}", e.getMessage());
            return false;
        }
    }

    @Override
    public String getSupportedDatabaseType() {
        return "MYSQL";
    }

    private Connection getConnection(DatabaseConfig config) throws SQLException {
        try {
            Class.forName(config.getDriverClassName());
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL driver not found", e);
        }
        
        return DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    }
} 