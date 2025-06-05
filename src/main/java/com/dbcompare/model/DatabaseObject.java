package com.dbcompare.model;

import com.dbcompare.enums.DatabaseObjectType;

/**
 * Represents a database object with its metadata and DDL definition
 */
public class DatabaseObject {
    private String schema;
    private String name;
    private DatabaseObjectType type;
    private String ddl;
    private String owner;
    private String createdDate;
    private String modifiedDate;

    public DatabaseObject() {}

    public DatabaseObject(String schema, String name, DatabaseObjectType type, String ddl) {
        this.schema = schema;
        this.name = name;
        this.type = type;
        this.ddl = ddl;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DatabaseObjectType getType() {
        return type;
    }

    public void setType(DatabaseObjectType type) {
        this.type = type;
    }

    public String getDdl() {
        return ddl;
    }

    public void setDdl(String ddl) {
        this.ddl = ddl;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getFullName() {
        return (schema != null && !schema.isEmpty()) ? schema + "." + name : name;
    }

    public String getObjectKey() {
        return type + ":" + getFullName();
    }

    @Override
    public String toString() {
        return String.format("DatabaseObject{schema='%s', name='%s', type=%s}", 
                           schema, name, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        DatabaseObject that = (DatabaseObject) obj;
        return getObjectKey().equals(that.getObjectKey());
    }

    @Override
    public int hashCode() {
        return getObjectKey().hashCode();
    }
} 