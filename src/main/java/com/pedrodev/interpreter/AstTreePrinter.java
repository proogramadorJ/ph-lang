package com.pedrodev.interpreter;

import com.pedrodev.paser.Bynary;
import com.pedrodev.paser.Expr;
import com.pedrodev.paser.Literal;

public class AstTreePrinter implements ExprVisitor<Void> {

    private final StringBuilder builder = new StringBuilder();
    private String indent = "";

    public String print(Expr expr) {
        expr.accept(this);
        return builder.toString();
    }

    @Override
    public Void visitBinary(Bynary expr) {
        builder.append(indent).append("BinaryExpr ").append(expr.op().lexeme()).append("\n");

        indent += "  ";
        expr.left().accept(this);
        expr.right().accept(this);
        indent = indent.substring(0, indent.length() - 2);

        return null;
    }

    @Override
    public Void visitLiteral(Literal expr) {
        builder.append(indent).append("Literal ").append(expr.value()).append("\n");
        return null;

    }

}
