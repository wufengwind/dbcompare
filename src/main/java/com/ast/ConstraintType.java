package com.ast;

public enum ConstraintType {
    PRIMARY_KEY,
    FOREIGN_KEY,
    UNIQUE,
    CHECK,
    DEFAULT,
    NOT_NULL;

    @Override
    public String toString() {
        return name().replace('_', ' ');
    }
}