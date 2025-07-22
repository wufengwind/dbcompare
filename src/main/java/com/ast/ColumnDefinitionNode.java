package com.ast;

import java.util.ArrayList;
import java.util.List;

public class ColumnDefinitionNode extends AstNode {
    private final String columnName;
    private final DataType dataType;
    private final List<AstNode> constraints = new ArrayList<>();
    private final String defaultValue;  // 新增默认值支持

    public ColumnDefinitionNode(String columnName, DataType dataType) {
        this(columnName, dataType, null);
    }

    public ColumnDefinitionNode(String columnName, DataType dataType, String defaultValue) {
        this.columnName = columnName;
        this.dataType = dataType;
        this.defaultValue = defaultValue;
    }

    public void addConstraint(AstNode constraint) {
        constraints.add(constraint);
    }

    // Getters
    public String getColumnName() {
        return columnName;
    }

    public DataType getDataType() {
        return dataType;
    }

    public List<AstNode> getConstraints() {
        return constraints;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(columnName).append(" ").append(dataType);

        if (defaultValue != null) {
            sb.append(" DEFAULT ").append(defaultValue);
        }

        for (AstNode constraint : constraints) {
            if (constraint instanceof NotNullConstraintNode) {
                sb.append(" NOT NULL");
            } else if (constraint instanceof PrimaryKeyConstraintNode) {
                sb.append(" PRIMARY KEY");
            } else if (constraint instanceof UniqueConstraintNode) {
                sb.append(" UNIQUE");
            }
            // 其他约束类型可以继续添加
        }

        return sb.toString();
    }

    @Override
    public String getType() {
        return "ColumnDefinition";
    }


    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);

        // 遍历约束
        for (AstNode constraint : constraints) {
            constraint.accept(visitor);
        }
    }
}