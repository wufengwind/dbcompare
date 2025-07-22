package com.ast;

public class CommentNode extends AstNode {
    public enum CommentTarget {
        TABLE,
        COLUMN
    }

    private final CommentTarget target;
    private final String tableName;
    private final String columnName;
    private final String comment;

    public CommentNode(CommentTarget target, String tableName, String columnName, String comment) {
        this.target = target;
        this.tableName = tableName;
        this.columnName = columnName;
        this.comment = comment;
    }

    public CommentTarget getTarget() {
        return target;
    }

    public String getTableName() {
        return tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String getType() {
        return "Comment";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        if (target == CommentTarget.TABLE) {
            return "COMMENT ON TABLE " + tableName + " IS '" + comment + "';";
        } else {
            return "COMMENT ON COLUMN " + tableName + "." + columnName + " IS '" + comment + "';";
        }
    }
}