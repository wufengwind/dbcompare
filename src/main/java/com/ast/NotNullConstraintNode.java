package com.ast;

public class NotNullConstraintNode extends AstNode {
    @Override
    public String getType() {
        return "NotNullConstraint";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "NOT NULL";
    }
}