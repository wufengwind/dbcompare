package com.antlr.oracle11;

import org.antlr.v4.runtime.Parser;

/**
 * PlSqlParserBase 用于存储 Oracle 版本控制标志。
 */
public abstract class PlSqlParserBase extends Parser {
    private boolean isVersion12 = false;
    private boolean isVersion10 = false;

    public PlSqlParserBase(org.antlr.v4.runtime.TokenStream input) {
        super(input);
    }

    public boolean isVersion12() {
        return isVersion12;
    }

    public void setVersion12(boolean value) {
        this.isVersion12 = value;
    }

    public boolean isVersion10() {
        return isVersion10;
    }

    public void setVersion10(boolean value) {
        this.isVersion10 = value;
    }
}
