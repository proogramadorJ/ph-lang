package com.pedrodev.interpreter;

import com.pedrodev.paser.Binary;
import com.pedrodev.paser.Literal;

public interface ExprVisitor<R> {
    R visitBinary(Binary expr);

    R visitLiteral(Literal expr);
}
