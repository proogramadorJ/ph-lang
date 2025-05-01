package com.pedrodev.paser;

import com.pedrodev.lexer.Token;
import com.pedrodev.lexer.TokenType;

import java.util.List;

public class Parser {

    private int pos = 0;
    private final List<Token> tokens;

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Expr parse() {
        return expression();
    }


    private Expr expression() {
        return term();
    }

    private Expr term() {
        Expr expr = factor();
        while (match(TokenType.PLUS) || match(TokenType.MINUS)) {
            Token op = tokens.get(pos - 1);
            Expr right = factor();
            expr = new Bynary(expr, op, right);
        }
        return expr;
    }

    private Expr factor() {
        Expr expr = primary();
        while (match(TokenType.STAR) || match(TokenType.SLASH)) {
            Token op = tokens.get(pos - 1);
            Expr right = primary();
            expr = new Bynary(expr, op, right);
        }
        return expr;
    }

    private Expr primary() {
        return new Literal(tokens.get(pos++).literal());
    }

    boolean match(TokenType tokenType) {
        if (pos < tokens.size() && tokens.get(pos).type() == tokenType) {
            pos++;
            return true;
        }
        return false;
    }
}