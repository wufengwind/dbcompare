package com.ast;

public enum DataType {
    INT("INT"),
    VARCHAR("VARCHAR"),
    DATE("DATE"),
    BOOLEAN("BOOLEAN"),
    FLOAT("FLOAT"),
    DOUBLE("DOUBLE"),
    DECIMAL("DECIMAL"),
    TEXT("TEXT"),
    TIMESTAMP("TIMESTAMP");

    private final String sqlType;

    DataType(String sqlType) {
        this.sqlType = sqlType;
    }

    public String getSqlType() {
        return sqlType;
    }

    @Override
    public String toString() {
        return sqlType;
    }

    public static DataType fromString(String s) {
        for (DataType dt : values()) {
            if (dt.sqlType.equalsIgnoreCase(s)) {
                return dt;
            }
        }
        throw new IllegalArgumentException("Unknown data type: " + s);
    }
}