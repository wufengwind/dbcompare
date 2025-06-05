package com.dbcompare.service;

import com.dbcompare.config.DatabaseConfig;
import com.dbcompare.enums.DatabaseObjectType;
import com.dbcompare.model.DatabaseObject;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 * Interface for extracting database metadata and DDL information
 */
public interface DatabaseMetadataExtractor {
    
    /**
     * Extract all database objects of specified types from the database
     * 
     * @param config Database configuration
     * @param objectTypes Set of object types to extract
     * @return List of database objects
     * @throws SQLException if database error occurs
     */
    List<DatabaseObject> extractObjects(DatabaseConfig config, Set<DatabaseObjectType> objectTypes) 
            throws SQLException;
    
    /**
     * Get DDL for a specific database object
     * 
     * @param config Database configuration
     * @param object Database object to get DDL for
     * @return DDL string
     * @throws SQLException if database error occurs
     */
    String getDDL(DatabaseConfig config, DatabaseObject object) throws SQLException;
    
    /**
     * Test database connection
     * 
     * @param config Database configuration
     * @return true if connection is successful
     */
    boolean testConnection(DatabaseConfig config);
    
    /**
     * Get supported database type
     * 
     * @return Database type string
     */
    String getSupportedDatabaseType();
} 