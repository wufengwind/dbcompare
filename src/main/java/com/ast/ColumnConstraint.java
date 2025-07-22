package com.ast;

// === 列上的约束 ===
public class ColumnConstraint {
    public final ConstraintType type;
    public final String defaultValue;

    public ColumnConstraint(ConstraintType type, String defaultValue) {
        this.type = type;
        this.defaultValue = defaultValue;
    }
}