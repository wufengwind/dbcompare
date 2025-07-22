package com.ast;

import java.util.List;

/**
 * AST 根节点，包含一组 DDL 节点
 */
public class Ast {
    private final List<AstNode> nodes;

    public Ast(List<AstNode> nodes) {
        this.nodes = nodes;
    }

    public List<AstNode> getNodes() {
        return nodes;
    }

    /**
     * 接受访问者遍历整个AST
     * @param visitor AST访问者
     */
    public void accept(AstNodeVisitor visitor) {
        for (AstNode node : nodes) {
            node.accept(visitor);
        }
    }
}