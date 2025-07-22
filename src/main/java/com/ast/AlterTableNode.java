package com.ast;

import java.util.List;

public class AlterTableNode extends AstNode {
    public enum AlterType {
        ADD_COLUMN,
        DROP_COLUMN,
        MODIFY_COLUMN,
        RENAME_COLUMN,
        ADD_CONSTRAINT,
        DROP_CONSTRAINT,
        RENAME_TABLE,
        ADD_INDEX,
        DROP_INDEX
    }

    private final String tableName;
    private final AlterType alterType;

    // 列相关操作
    private final ColumnDefinitionNode column;
    private final String oldColumnName;
    private final String newColumnName;
    private final String columnName;

    // 约束相关操作
    private final TableConstraintNode constraint;
    private final String constraintName;

    // 表重命名
    private final String newTableName;

    // 索引操作
    private final String indexName;

    // 全功能构造函数
    public AlterTableNode(String tableName, AlterType alterType,
                          ColumnDefinitionNode column,
                          String oldColumnName, String newColumnName, String columnName,
                          TableConstraintNode constraint, String constraintName,
                          String newTableName, String indexName) {
        this.tableName = tableName;
        this.alterType = alterType;
        this.column = column;
        this.oldColumnName = oldColumnName;
        this.newColumnName = newColumnName;
        this.columnName = columnName;
        this.constraint = constraint;
        this.constraintName = constraintName;
        this.newTableName = newTableName;
        this.indexName = indexName;
    }

    // === 便捷构造方法 ===

    // 添加列
    public static AlterTableNode addColumn(String tableName, ColumnDefinitionNode column) {
        return new AlterTableNode(tableName, AlterType.ADD_COLUMN,
                column, null, null, null,
                null, null, null, null);
    }

    // 删除列
    public static AlterTableNode dropColumn(String tableName, String columnName) {
        return new AlterTableNode(tableName, AlterType.DROP_COLUMN,
                null, null, null, columnName,
                null, null, null, null);
    }

    // 修改列
    public static AlterTableNode modifyColumn(String tableName, String oldColumnName, ColumnDefinitionNode newColumn) {
        return new AlterTableNode(tableName, AlterType.MODIFY_COLUMN,
                newColumn, oldColumnName, null, null,
                null, null, null, null);
    }

    // 重命名列
    public static AlterTableNode renameColumn(String tableName, String oldColumnName, String newColumnName) {
        return new AlterTableNode(tableName, AlterType.RENAME_COLUMN,
                null, oldColumnName, newColumnName, null,
                null, null, null, null);
    }

    // 添加约束
    public static AlterTableNode addConstraint(String tableName, TableConstraintNode constraint) {
        return new AlterTableNode(tableName, AlterType.ADD_CONSTRAINT,
                null, null, null, null,
                constraint, null, null, null);
    }

    // 删除约束
    public static AlterTableNode dropConstraint(String tableName, String constraintName) {
        return new AlterTableNode(tableName, AlterType.DROP_CONSTRAINT,
                null, null, null, null,
                null, constraintName, null, null);
    }

    // 重命名表
    public static AlterTableNode renameTable(String tableName, String newTableName) {
        return new AlterTableNode(tableName, AlterType.RENAME_TABLE,
                null, null, null, null,
                null, null, newTableName, null);
    }

    // 添加索引
    public static AlterTableNode addIndex(String tableName, String indexName) {
        return new AlterTableNode(tableName, AlterType.ADD_INDEX,
                null, null, null, null,
                null, null, null, indexName);
    }

    // 删除索引
    public static AlterTableNode dropIndex(String tableName, String indexName) {
        return new AlterTableNode(tableName, AlterType.DROP_INDEX,
                null, null, null, null,
                null, null, null, indexName);
    }

    // === Getters ===

    public String getTableName() {
        return tableName;
    }

    public AlterType getAlterType() {
        return alterType;
    }

    public ColumnDefinitionNode getColumn() {
        return column;
    }

    public String getOldColumnName() {
        return oldColumnName;
    }

    public String getNewColumnName() {
        return newColumnName;
    }

    public String getColumnName() {
        return columnName;
    }

    public TableConstraintNode getConstraint() {
        return constraint;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public String getNewTableName() {
        return newTableName;
    }

    public String getIndexName() {
        return indexName;
    }

    @Override
    public String toString() {
        switch (alterType) {
            case ADD_COLUMN:
                return String.format("ALTER TABLE %s ADD COLUMN %s;", tableName, column);
            case DROP_COLUMN:
                return String.format("ALTER TABLE %s DROP COLUMN %s;", tableName, columnName);
            case MODIFY_COLUMN:
                return String.format("ALTER TABLE %s MODIFY COLUMN %s %s;",
                        tableName, oldColumnName, column);
            case RENAME_COLUMN:
                return String.format("ALTER TABLE %s RENAME COLUMN %s TO %s;",
                        tableName, oldColumnName, newColumnName);
            case ADD_CONSTRAINT:
                return String.format("ALTER TABLE %s ADD CONSTRAINT %s;",
                        tableName, constraint);
            case DROP_CONSTRAINT:
                return String.format("ALTER TABLE %s DROP CONSTRAINT %s;",
                        tableName, constraintName);
            case RENAME_TABLE:
                return String.format("ALTER TABLE %s RENAME TO %s;",
                        tableName, newTableName);
            case ADD_INDEX:
                return String.format("ALTER TABLE %s ADD INDEX %s;",
                        tableName, indexName);
            case DROP_INDEX:
                return String.format("ALTER TABLE %s DROP INDEX %s;",
                        tableName, indexName);
            default:
                return "UNKNOWN ALTER TABLE OPERATION";
        }
    }

    @Override
    public String getType() {
        return "AlterTable";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);

        // 如果有子节点，遍历子节点
        if (column != null) {
            column.accept(visitor);
        }

        if (constraint != null) {
            constraint.accept(visitor);
        }
    }
}