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
 * DB2 database metadata extractor implementation
 */
public class DB2MetadataExtractor implements DatabaseMetadataExtractor {
    
    private static final Logger logger = LoggerFactory.getLogger(DB2MetadataExtractor.class);

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
                logger.warn("DB2不支持对象类型 {}", type);
        }
        
        return objects;
    }

    private List<DatabaseObject> extractTables(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> tables = new ArrayList<>();
        
        String sql = "SELECT TABNAME FROM SYSCAT.TABLES WHERE TABSCHEMA = ? AND TYPE = 'T'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject table = new DatabaseObject();
                    table.setSchema(schema);
                    table.setName(rs.getString("TABNAME"));
                    table.setType(DatabaseObjectType.TABLE);
                    tables.add(table);
                }
            }
        }
        
        return tables;
    }

    private List<DatabaseObject> extractViews(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> views = new ArrayList<>();
        
        String sql = "SELECT VIEWNAME FROM SYSCAT.VIEWS WHERE VIEWSCHEMA = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject view = new DatabaseObject();
                    view.setSchema(schema);
                    view.setName(rs.getString("VIEWNAME"));
                    view.setType(DatabaseObjectType.VIEW);
                    views.add(view);
                }
            }
        }
        
        return views;
    }

    private List<DatabaseObject> extractProcedures(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> procedures = new ArrayList<>();
        
        String sql = "SELECT PROCNAME FROM SYSCAT.PROCEDURES WHERE PROCSCHEMA = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject procedure = new DatabaseObject();
                    procedure.setSchema(schema);
                    procedure.setName(rs.getString("PROCNAME"));
                    procedure.setType(DatabaseObjectType.PROCEDURE);
                    procedures.add(procedure);
                }
            }
        }
        
        return procedures;
    }

    private List<DatabaseObject> extractFunctions(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> functions = new ArrayList<>();
        
        String sql = "SELECT FUNCNAME FROM SYSCAT.FUNCTIONS WHERE FUNCSCHEMA = ? AND ORIGIN = 'U'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject function = new DatabaseObject();
                    function.setSchema(schema);
                    function.setName(rs.getString("FUNCNAME"));
                    function.setType(DatabaseObjectType.FUNCTION);
                    functions.add(function);
                }
            }
        }
        
        return functions;
    }

    private List<DatabaseObject> extractTriggers(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> triggers = new ArrayList<>();
        
        String sql = "SELECT TRIGNAME FROM SYSCAT.TRIGGERS WHERE TRIGSCHEMA = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject trigger = new DatabaseObject();
                    trigger.setSchema(schema);
                    trigger.setName(rs.getString("TRIGNAME"));
                    trigger.setType(DatabaseObjectType.TRIGGER);
                    triggers.add(trigger);
                }
            }
        }
        
        return triggers;
    }

    private List<DatabaseObject> extractIndexes(Connection connection, String schema) throws SQLException {
        List<DatabaseObject> indexes = new ArrayList<>();
        
        String sql = "SELECT INDNAME, TABNAME FROM SYSCAT.INDEXES " +
                    "WHERE INDSCHEMA = ? AND UNIQUERULE = 'D'";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, schema.toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DatabaseObject index = new DatabaseObject();
                    index.setSchema(schema);
                    String tableName = rs.getString("TABNAME");
                    String indexName = rs.getString("INDNAME");
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
                    return "-- DB2不支持 " + object.getType() + " 类型的DDL提取";
            }
        }
    }

    private String getTableDDL(Connection connection, DatabaseObject table) throws SQLException {
        StringBuilder ddl = new StringBuilder();
        
        String sql = "SELECT COLNAME, TYPENAME, LENGTH, SCALE, NULLS, DEFAULT " +
                    "FROM SYSCAT.COLUMNS " +
                    "WHERE TABSCHEMA = ? AND TABNAME = ? " +
                    "ORDER BY COLNO";
        
        ddl.append("CREATE TABLE ").append(table.getSchema()).append(".").append(table.getName()).append(" (\n");
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, table.getSchema().toUpperCase());
            stmt.setString(2, table.getName().toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                boolean first = true;
                while (rs.next()) {
                    if (!first) ddl.append(",\n");
                    first = false;
                    
                    ddl.append("    ").append(rs.getString("COLNAME")).append(" ");
                    ddl.append(rs.getString("TYPENAME"));
                    
                    int length = rs.getInt("LENGTH");
                    int scale = rs.getInt("SCALE");
                    if (length > 0) {
                        ddl.append("(").append(length);
                        if (scale > 0) {
                            ddl.append(",").append(scale);
                        }
                        ddl.append(")");
                    }
                    
                    if ("N".equals(rs.getString("NULLS"))) {
                        ddl.append(" NOT NULL");
                    }
                    
                    String defaultValue = rs.getString("DEFAULT");
                    if (defaultValue != null && !defaultValue.trim().isEmpty()) {
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
        
        String sql = "SELECT TEXT FROM SYSCAT.VIEWS WHERE VIEWSCHEMA = ? AND VIEWNAME = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, view.getSchema().toUpperCase());
            stmt.setString(2, view.getName().toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append("CREATE VIEW ").append(view.getSchema()).append(".")
                       .append(view.getName()).append(" AS\n");
                    ddl.append(rs.getString("TEXT"));
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
        
        String sql;
        if (routine.getType() == DatabaseObjectType.PROCEDURE) {
            sql = "SELECT TEXT FROM SYSCAT.PROCEDURES WHERE PROCSCHEMA = ? AND PROCNAME = ?";
        } else {
            sql = "SELECT BODY FROM SYSCAT.FUNCTIONS WHERE FUNCSCHEMA = ? AND FUNCNAME = ?";
        }
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, routine.getSchema().toUpperCase());
            stmt.setString(2, routine.getName().toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String columnName = routine.getType() == DatabaseObjectType.PROCEDURE ? "TEXT" : "BODY";
                    ddl.append(rs.getString(columnName));
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
        
        String sql = "SELECT TEXT FROM SYSCAT.TRIGGERS WHERE TRIGSCHEMA = ? AND TRIGNAME = ?";
        
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, trigger.getSchema().toUpperCase());
            stmt.setString(2, trigger.getName().toUpperCase());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ddl.append(rs.getString("TEXT"));
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
            
            String sql = "SELECT i.UNIQUERULE, ic.COLNAME " +
                        "FROM SYSCAT.INDEXES i " +
                        "JOIN SYSCAT.INDEXCOLUSE ic ON i.INDSCHEMA = ic.INDSCHEMA AND i.INDNAME = ic.INDNAME " +
                        "WHERE i.INDSCHEMA = ? AND i.INDNAME = ? " +
                        "ORDER BY ic.COLSEQ";
            
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, index.getSchema().toUpperCase());
                stmt.setString(2, indexName.toUpperCase());
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        ddl.append("CREATE ");
                        if ("U".equals(rs.getString("UNIQUERULE"))) {
                            ddl.append("UNIQUE ");
                        }
                        ddl.append("INDEX ").append(indexName).append(" ON ")
                           .append(index.getSchema()).append(".").append(tableName).append(" (");
                        
                        boolean first = true;
                        do {
                            if (!first) ddl.append(", ");
                            first = false;
                            ddl.append(rs.getString("COLNAME"));
                        } while (rs.next());
                        
                        ddl.append(")");
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
            logger.error("DB2数据库连接测试失败: {}", e.getMessage());
            return false;
        }
    }

    @Override
    public String getSupportedDatabaseType() {
        return "DB2";
    }

    private Connection getConnection(DatabaseConfig config) throws SQLException {
        return DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    }
}