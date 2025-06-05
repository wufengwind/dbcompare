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
 * Oracle database metadata extractor implementation
 */
public class OracleMetadataExtractor implements DatabaseMetadataExtractor {
    
    private static final Logger logger = LoggerFactory.getLogger(OracleMetadataExtractor.class);

    @Override
    public List<DatabaseObject> extractObjects(DatabaseConfig config, Set<DatabaseObjectType> objectTypes) 
            throws SQLException {
        List<DatabaseObject> objects = new ArrayList<>();
        
        try (Connection connection = getConnection(config)) {
            String schema = config.getSchema();
            if (schema == null || schema.isEmpty()) {
                schema = connection.getMetaData().getUserName().toUpperCase();
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
                logger.warn("Oracle不支持对象类型 {}", type);
        }
        
        return objects;
    }

    private List<DatabaseObject> extractTables(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> tables = new ArrayList<>();
        
        String sql = "SELECT TABLE_NAME FROM ALL_TABLES WHERE OWNER = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
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
        
        String sql = "SELECT VIEW_NAME FROM ALL_VIEWS WHERE OWNER = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject view = new DatabaseObject();
                    view.setSchema(schema);
                    view.setName(rs.getString("VIEW_NAME"));
                    view.setType(DatabaseObjectType.VIEW);
                    views.add(view);
                }
            }
        }
        
        return views;
    }

    private List<DatabaseObject> extractProcedures(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> procedures = new ArrayList<>();
        
        String sql = "SELECT OBJECT_NAME FROM ALL_PROCEDURES WHERE OBJECT_TYPE = 'PROCEDURE' AND OWNER = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject procedure = new DatabaseObject();
                    procedure.setSchema(schema);
                    procedure.setName(rs.getString("OBJECT_NAME"));
                    procedure.setType(DatabaseObjectType.PROCEDURE);
                    procedures.add(procedure);
                }
            }
        }
        
        return procedures;
    }

    private List<DatabaseObject> extractFunctions(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> functions = new ArrayList<>();
        
        String sql = "SELECT OBJECT_NAME FROM ALL_PROCEDURES WHERE OBJECT_TYPE = 'FUNCTION' AND OWNER = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject function = new DatabaseObject();
                    function.setSchema(schema);
                    function.setName(rs.getString("OBJECT_NAME"));
                    function.setType(DatabaseObjectType.FUNCTION);
                    functions.add(function);
                }
            }
        }
        
        return functions;
    }

    private List<DatabaseObject> extractTriggers(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> triggers = new ArrayList<>();
        
        String sql = "SELECT TRIGGER_NAME FROM ALL_TRIGGERS WHERE OWNER = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
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
        
        String sql = "SELECT INDEX_NAME, TABLE_NAME FROM ALL_INDEXES WHERE UNIQUENESS = 'NONUNIQUE' AND OWNER = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject index = new DatabaseObject();
                    index.setSchema(schema);
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
                case FUNCTION:
                    return getRoutineDDL(connection, object);
                case TRIGGER:
                    return getTriggerDDL(connection, object);
                case INDEX:
                    return getIndexDDL(connection, object);
                default:
                    return "-- Oracle不支持 " + object.getType() + " 类型的DDL提取";
            }
        }
    }

    private String getTableDDL(Connection connection, DatabaseObject table) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        String sql = "SELECT DBMS_METADATA.GET_DDL('TABLE', ?, ?) FROM DUAL";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, table.getName());
            stmt.setString(2, table.getSchema().toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append(rs.getString(1));
                }
            }
        } catch (SQLException e) {
            logger.warn("无法获取表 {} 的DDL: {}", table.getObjectKey(), e.getMessage());
            ddl.append("-- 无法获取表DDL: ").append(e.getMessage());
        }
        
        return ddl.toString();
    }

    private String getViewDDL(Connection connection, DatabaseObject view) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        String sql = "SELECT DBMS_METADATA.GET_DDL('VIEW', ?, ?) FROM DUAL";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, view.getName());
            stmt.setString(2, view.getSchema().toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append(rs.getString(1));
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
        String objectType = routine.getType() == DatabaseObjectType.PROCEDURE ? "PROCEDURE" : "FUNCTION";
        String sql = "SELECT DBMS_METADATA.GET_DDL(?, ?, ?) FROM DUAL";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, objectType);
            stmt.setString(2, routine.getName());
            stmt.setString(3, routine.getSchema().toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append(rs.getString(1));
                }
            }
        } catch (SQLException e) {
            logger.warn("无法获取{} {} 的DDL: {}", objectType, routine.getObjectKey(), e.getMessage());
            ddl.append("-- 无法获取").append(objectType).append("DDL: ").append(e.getMessage());
        }
        
        return ddl.toString();
    }

    private String getTriggerDDL(Connection connection, DatabaseObject trigger) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        String sql = "SELECT DBMS_METADATA.GET_DDL('TRIGGER', ?, ?) FROM DUAL";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, trigger.getName());
            stmt.setString(2, trigger.getSchema().toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append(rs.getString(1));
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
            
            String sql = "SELECT DBMS_METADATA.GET_DDL('INDEX', ?, ?) FROM DUAL";
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, indexName);
                stmt.setString(2, index.getSchema().toUpperCase());
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        ddl.append(rs.getString(1));
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
            logger.error("Oracle数据库连接测试失败: {}", e.getMessage());
            return false;
        }
    }

    @Override
    public String getSupportedDatabaseType() {
        return "ORACLE";
    }

    private Connection getConnection(DatabaseConfig config) throws SQLException {
        return DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    }
}