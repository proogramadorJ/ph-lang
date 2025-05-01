package com.pedrodev.paser;

import com.pedrodev.interpreter.ExprVisitor;
import com.pedrodev.lexer.Token;

public record Bynary(Expr left, Token op, Expr right) implements Expr {

    @Override
    public <R> R accept(ExprVisitor<R> visitor) {
        return visitor.visitBinary(this);
    }
}
