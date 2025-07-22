package com.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * 所有 AST 节点的基类
 */
public abstract class AstNode {
    // 节点位置信息
    private int startLine;
    private int startColumn;
    private int endLine;
    private int endColumn;

    // 父节点引用
    private AstNode parent;

    // 子节点列表
    private List<AstNode> children = new ArrayList<>();

    // 节点元数据
    private Object metadata;

    /**
     * 获取节点类型
     * @return 节点类型字符串
     */
    public abstract String getType();

    /**
     * 接受访问者
     * @param visitor AST访问者
     */
    public abstract void accept(AstNodeVisitor visitor);

    /**
     * 添加子节点
     * @param child 子节点
     */
    public void addChild(AstNode child) {
        if (child != null) {
            children.add(child);
            child.setParent(this);
        }
    }

    /**
     * 获取所有子节点
     * @return 子节点列表
     */
    public List<AstNode> getChildren() {
        return children;
    }

    /**
     * 设置位置信息
     * @param startLine 起始行号
     * @param startColumn 起始列号
     * @param endLine 结束行号
     * @param endColumn 结束列号
     */
    public void setLocation(int startLine, int startColumn, int endLine, int endColumn) {
        this.startLine = startLine;
        this.startColumn = startColumn;
        this.endLine = endLine;
        this.endColumn = endColumn;
    }

    /**
     * 获取起始行号
     * @return 起始行号
     */
    public int getStartLine() {
        return startLine;
    }

    /**
     * 获取起始列号
     * @return 起始列号
     */
    public int getStartColumn() {
        return startColumn;
    }

    /**
     * 获取结束行号
     * @return 结束行号
     */
    public int getEndLine() {
        return endLine;
    }

    /**
     * 获取结束列号
     * @return 结束列号
     */
    public int getEndColumn() {
        return endColumn;
    }

    /**
     * 设置父节点
     * @param parent 父节点
     */
    public void setParent(AstNode parent) {
        this.parent = parent;
    }

    /**
     * 获取父节点
     * @return 父节点
     */
    public AstNode getParent() {
        return parent;
    }

    /**
     * 设置元数据
     * @param metadata 元数据对象
     */
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     * 获取元数据
     * @return 元数据对象
     */
    public Object getMetadata() {
        return metadata;
    }

    /**
     * 查找特定类型的祖先节点
     * @param nodeType 节点类型
     * @return 找到的祖先节点，未找到返回null
     */
    public AstNode findAncestor(Class<? extends AstNode> nodeType) {
        AstNode current = parent;
        while (current != null) {
            if (nodeType.isInstance(current)) {
                return current;
            }
            current = current.getParent();
        }
        return null;
    }

    /**
     * 遍历子节点
     * @param visitor 节点访问者
     */
    public void traverseChildren(AstNodeVisitor visitor) {
        for (AstNode child : children) {
            child.accept(visitor);
        }
    }

    /**
     * 获取节点位置信息字符串
     * @return 位置信息字符串
     */
    public String getLocationString() {
        return String.format("Line %d:%d to %d:%d",
                startLine, startColumn,
                endLine, endColumn);
    }

    /**
     * 获取节点树深度
     * @return 节点深度
     */
    public int getDepth() {
        int depth = 0;
        AstNode current = this;
        while (current != null) {
            depth++;
            current = current.getParent();
        }
        return depth;
    }
}