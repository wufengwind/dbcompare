package com.dbcompare.config;

/**
 * Database configuration class to hold connection information
 */
public class DatabaseConfig {
    private final String type;
    private final String url;
    private final String username;
    private final String password;
    private final String schema;

    public DatabaseConfig(String type, String url, String username, String password, String schema) {
        this.type = type.toUpperCase();
        this.url = url;
        this.username = username;
        this.password = password;
        this.schema = schema;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSchema() {
        return schema;
    }

    public String getDriverClassName() {
        switch (type) {
            case "MYSQL":
                return "com.mysql.cj.jdbc.Driver";
            case "ORACLE":
                return "oracle.jdbc.driver.OracleDriver";
            case "SQLSERVER":
                return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            case "POSTGRESQL":
                return "org.postgresql.Driver";
            case "DB2":
                return "com.ibm.db2.jcc.DB2Driver";
            case "DM8":
                return "dm.jdbc.driver.DmDriver";
            default:
                throw new IllegalArgumentException("Unsupported database type: " + type);
        }
    }

    @Override
    public String toString() {
        return String.format("DatabaseConfig{type='%s', url='%s', username='%s', schema='%s'}", 
                           type, url, username, schema);
    }
} 