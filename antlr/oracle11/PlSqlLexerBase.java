package com.antlr.oracle11;// File: PlSqlLexerBase.java
import org.antlr.v4.runtime.*;

public abstract class PlSqlLexerBase extends Lexer {
    public PlSqlLexerBase(CharStream input) {
        super(input);
    }

    protected boolean IsNewlineAtPos(int pos) {
        int la = _input.LA(pos);
        return la == '\r' || la == '\n';
    }

    protected boolean IsWhitespaceAtPos(int pos) {
        int la = _input.LA(pos);
        return la == ' ' || la == '\t' || la == '\f';
    }
}
