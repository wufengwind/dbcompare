package com.antlr;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 简化版的ParseTree实现，用于骨架比较
 */
class SimplifiedParseTree implements ParseTree, org.antlr.v4.runtime.tree.RuleNode {
    private String text;
    private List<ParseTree> children = new ArrayList<>();
    private Tree parent; // 修改为Tree类型
    private RuleContext ruleContext; // 新增字段存储RuleContext

    public SimplifiedParseTree(String text) {
        this.text = text;
    }

    public SimplifiedParseTree(String text, RuleContext ruleContext) {
        this.text = text;
        this.ruleContext = ruleContext;
    }

    public void addChild(ParseTree child) {
        children.add(child);
    }

    @Override
    public ParseTree getChild(int i) {
        if (i < 0 || i >= children.size()) {
            return null;
        }
        return children.get(i);
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Object getPayload() {
        return text;
    }

    @Override
    public int getChildCount() {
        return children.size();
    }

    @Override
    public ParseTree getParent() {
        return (ParseTree) parent;
    }

    @Override
    public void setParent(RuleContext parent) {
        this.parent = parent;
    }

    @Override
    public org.antlr.v4.runtime.misc.Interval getSourceInterval() {
        return org.antlr.v4.runtime.misc.Interval.INVALID;
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
        return visitor.visitChildren(this);
    }

    @Override
    public String toStringTree() {
        return text;
    }

    @Override
    public String toStringTree(org.antlr.v4.runtime.Parser parser) {
        return toStringTree();
    }

    @Override
    public String toString() {
        return text;
    }

    // 实现RuleNode接口中缺失的方法
    @Override
    public RuleContext getRuleContext() {
        return ruleContext;
    }
}
