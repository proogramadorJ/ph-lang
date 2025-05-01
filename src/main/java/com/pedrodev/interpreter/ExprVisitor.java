package com.pedrodev.interpreter;

import com.pedrodev.paser.Bynary;
import com.pedrodev.paser.Literal;

public interface ExprVisitor<R> {
    R visitBinary(Bynary expr);

    R visitLiteral(Literal expr);
}
