package com.ast;

/**
 * CREATE VIEW 语句的 AST 节点
 */
public class CreateViewNode extends AstNode {
    private final String viewName;
    private final String selectStatement;

    public CreateViewNode(String viewName, String selectStatement) {
        this.viewName = viewName;
        this.selectStatement = selectStatement;
    }

    public String getViewName() {
        return viewName;
    }

    public String getSelectStatement() {
        return selectStatement;
    }

    @Override
    public String getType() {
        return "CreateView";
    }

    @Override
    public void accept(AstNodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "CREATE VIEW " + viewName + " AS " + selectStatement + ";";
    }
}