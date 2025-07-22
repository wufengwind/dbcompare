package com.ast;

import java.util.List;

public class TableConstraintNode extends AstNode {
    public enum ConstraintType {
        PRIMARY_KEY,
        FOREIGN_KEY,
        UNIQUE,
        CHECK
    }

    private final ConstraintType type;
    private final String constraintName;
    private final List<String> columnNames;
    private final AstNode constraintDetails;

    public TableConstraintNode(ConstraintType type, String constraintName,
                               List<String> columnNames, AstNode constraintDetails) {
        this.type = type;
        this.constraintName = constraintName;
        this.columnNames = columnNames;
        this.constraintDetails = constraintDetails;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public AstNode getConstraintDetails() {
        return constraintDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (constraintName != null) {
            sb.append("CONSTRAINT ").append(constraintName).append(" ");
        }

        switch (type) {
            case PRIMARY_KEY:
                sb.append("PRIMARY KEY (");
                break;
            case FOREIGN_KEY:
                sb.append("FOREIGN KEY (");
                break;
            case UNIQUE:
                sb.append("UNIQUE (");
                break;
            case CHECK:
                sb.append("CHECK (");
                break;
        }

        sb.append(String.join(", ", columnNames));
        sb.append(")");

        // 外键需要额外信息
        if (type == ConstraintType.FOREIGN_KEY && constraintDetails instanceof ForeignKeyConstraintNode) {
            ForeignKeyConstraintNode fk = (ForeignKeyConstraintNode) constraintDetails;
            sb.append(" REFERENCES ")
                    .append(fk.getReferenceTable())
                    .append(" (")
                    .append(String.join(", ", fk.getReferenceColumns()))
                    .append(")");
        } else if (type == ConstraintType.CHECK && constraintDetails instanceof CheckConstraintNode) {
            CheckConstraintNode check = (CheckConstraintNode) constraintDetails;
            sb.append(" ").append(check.toString());
        }

        return sb.toString();
    }

    @Override
    public String getType() {
        return "TableConstraint";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);

        if (constraintDetails != null) {
            constraintDetails.accept(visitor);
        }
    }
}