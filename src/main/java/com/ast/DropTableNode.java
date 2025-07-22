package com.ast;

public class DropTableNode extends AstNode {
    private final String tableName;

    public DropTableNode(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    @Override
    public String getType() {
        return "DropTable";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "DROP TABLE " + tableName + ";";
    }
}