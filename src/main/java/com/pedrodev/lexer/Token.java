package com.pedrodev.lexer;

public record Token(TokenType type, String lexeme, Object literal, int line, int column) {


    @Override
    public String toString() {
        return "Token{" +
                "type=" + type +
                ", lexeme='" + lexeme + '\'' +
                ", literal=" + literal +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}