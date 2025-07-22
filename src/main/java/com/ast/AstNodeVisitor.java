package com.ast;

/**
 * AST 节点访问者接口
 */
public interface AstNodeVisitor {
    void visit(AlterTableNode node);
    void visit(ColumnDefinitionNode node);
    void visit(CreateTableNode node);
    void visit(CreateViewNode node);
    void visit(DropTableNode node);
    void visit(DropViewNode node);
    void visit(CreateIndexNode node);
    void visit(ForeignKeyConstraintNode node);
    void visit(PrimaryKeyConstraintNode node);
    void visit(UniqueConstraintNode node);
    void visit(NotNullConstraintNode node);
    void visit(CheckConstraintNode node);
    void visit(DefaultConstraintNode node);
    void visit(CommentNode node);
    void visit(TableConstraintNode node);
    void visit(Identifier node);
    void visit(ForeignKeyDefinition node);
    void visit(IndexDefinition indexDefinition);
}