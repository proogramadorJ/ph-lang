package com.pedrodev.paser;

import com.pedrodev.interpreter.ExprVisitor;

public record Literal(Object value) implements Expr {


    @Override
    public <R> R accept(ExprVisitor<R> visitor) {
        return visitor.visitLiteral(this);
    }
}
