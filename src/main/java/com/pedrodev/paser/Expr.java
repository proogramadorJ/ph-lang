package com.pedrodev.paser;

import com.pedrodev.interpreter.ExprVisitor;

public interface Expr {
    <R> R accept(ExprVisitor<R> visitor);
}
