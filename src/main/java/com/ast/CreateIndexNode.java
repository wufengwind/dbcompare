package com.ast;

import java.util.List;

public class CreateIndexNode extends AstNode {
    private final String indexName;
    private final String tableName;
    private final List<String> columnNames;
    private final boolean unique;

    public CreateIndexNode(String indexName, String tableName, List<String> columnNames, boolean unique) {
        this.indexName = indexName;
        this.tableName = tableName;
        this.columnNames = columnNames;
        this.unique = unique;
    }

    public String getIndexName() {
        return indexName;
    }

    public String getTableName() {
        return tableName;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public boolean isUnique() {
        return unique;
    }

    @Override
    public String getType() {
        return "CreateIndex";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return (unique ? "CREATE UNIQUE INDEX " : "CREATE INDEX ") +
                indexName + " ON " + tableName +
                " (" + String.join(", ", columnNames) + ");";
    }
}