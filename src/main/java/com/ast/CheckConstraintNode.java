package com.ast;

public class CheckConstraintNode extends AstNode {
    private final String checkExpression;

    public CheckConstraintNode(String checkExpression) {
        this.checkExpression = checkExpression;
    }

    // Getters
    public String getCheckExpression() {
        return checkExpression;
    }

    @Override
    public String getType() {
        return "CheckConstraint";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "CHECK (" + checkExpression + ")";
    }
}