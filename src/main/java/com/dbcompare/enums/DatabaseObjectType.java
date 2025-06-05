package com.dbcompare.enums;

/**
 * Enumeration of database object types that can be compared
 */
public enum DatabaseObjectType {
    TABLE("TABLE"),
    VIEW("VIEW"),
    PROCEDURE("PROCEDURE"),
    FUNCTION("FUNCTION"),
    TRIGGER("TRIGGER"),
    INDEX("INDEX"),
    CONSTRAINT("CONSTRAINT"),
    SEQUENCE("SEQUENCE"),
    SYNONYM("SYNONYM");

    private final String value;

    DatabaseObjectType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static DatabaseObjectType fromString(String text) {
        for (DatabaseObjectType type : DatabaseObjectType.values()) {
            if (type.value.equalsIgnoreCase(text)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }

    @Override
    public String toString() {
        return value;
    }
} 