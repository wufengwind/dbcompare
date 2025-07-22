package com.ast;

import java.util.List;

public class CreateTableNode extends AstNode {
    private final String tableName;
    private final List<ColumnDefinitionNode> columns;
    private final List<TableConstraintNode> tableConstraints;

    public CreateTableNode(String tableName,
                           List<ColumnDefinitionNode> columns,
                           List<TableConstraintNode> constraints) {
        this.tableName = tableName;
        this.columns = columns;
        this.tableConstraints = constraints;
    }

    public String getTableName() {
        return tableName;
    }

    public List<ColumnDefinitionNode> getColumns() {
        return columns;
    }

    public List<TableConstraintNode> getConstraints() {
        return tableConstraints;
    }

    @Override
    public String getType() {
        return "CreateTable";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);

        // 遍历列定义
        for (ColumnDefinitionNode column : columns) {
            column.accept(visitor);
        }

        // 遍历表级约束
        for (TableConstraintNode constraint : tableConstraints) {
            constraint.accept(visitor);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ").append(tableName).append(" (\n");

        // 添加列定义
        for (int i = 0; i < columns.size(); i++) {
            sb.append("  ").append(columns.get(i).toString());
            if (i < columns.size() - 1 || !tableConstraints.isEmpty()) {
                sb.append(",");
            }
            sb.append("\n");
        }

        // 添加表级约束
        for (int i = 0; i < tableConstraints.size(); i++) {
            sb.append("  ").append(tableConstraints.get(i).toString());
            if (i < tableConstraints.size() - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }

        sb.append(");");
        return sb.toString();
    }
}