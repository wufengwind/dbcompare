package com.ast;

import java.util.List;

public class IndexDefinition extends AstNode {
    public final String indexName;
    public final String tableName;
    public final List<String> columnNames;
    public final boolean unique;

    public IndexDefinition(String indexName, String tableName, List<String> columnNames, boolean unique) {
        this.indexName = indexName;
        this.tableName = tableName;
        this.columnNames = columnNames;
        this.unique = unique;
    }

    @Override
    public String getType() {
        return "IndexDefinition";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }
}
