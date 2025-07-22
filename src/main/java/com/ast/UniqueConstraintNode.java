package com.ast;

import java.util.List;

public class UniqueConstraintNode extends AstNode {
    private final List<String> columnNames;

    public UniqueConstraintNode(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    // Getters
    public List<String> getColumnNames() {
        return columnNames;
    }

    @Override
    public String getType() {
        return "UniqueConstraint";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "UNIQUE (" + String.join(", ", columnNames) + ")";
    }
}