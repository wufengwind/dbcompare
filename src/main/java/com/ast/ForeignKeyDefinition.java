package com.ast;

import java.util.List;

public class ForeignKeyDefinition extends AstNode {
    private final List<String> columnNames;
    private final String referenceTable;
    private final List<String> referenceColumns;

    public ForeignKeyDefinition(List<String> columnNames, String referenceTable, List<String> referenceColumns) {
        this.columnNames = columnNames;
        this.referenceTable = referenceTable;
        this.referenceColumns = referenceColumns;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public String getReferenceTable() {
        return referenceTable;
    }

    public List<String> getReferenceColumns() {
        return referenceColumns;
    }

    @Override
    public String getType() {
        return "ForeignKeyDefinition";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "FOREIGN KEY (" + String.join(", ", columnNames) + ") " +
                "REFERENCES " + referenceTable +
                " (" + String.join(", ", referenceColumns) + ")";
    }
}