package com.ast;

public class DefaultConstraintNode extends AstNode {
    private final String defaultValue;

    public DefaultConstraintNode(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    @Override
    public String getType() {
        return "DefaultConstraint";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "DEFAULT " + defaultValue;
    }
}