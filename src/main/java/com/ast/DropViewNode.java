package com.ast;

/**
 * DROP VIEW 语句的 AST 节点
 */
public class DropViewNode extends AstNode {
    private final String viewName;

    public DropViewNode(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    @Override
    public String getType() {
        return "DropView";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "DROP VIEW " + viewName + ";";
    }
}