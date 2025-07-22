package com.ast;

import java.util.List;

public class PrimaryKeyConstraintNode extends AstNode {
    private final List<String> columnNames;

    public PrimaryKeyConstraintNode(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    // Getters
    public List<String> getColumnNames() {
        return columnNames;
    }

    @Override
    public String getType() {
        return "PrimaryKeyConstraint";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "PRIMARY KEY (" + String.join(", ", columnNames) + ")";
    }
}