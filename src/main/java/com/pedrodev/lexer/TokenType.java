package com.pedrodev.lexer;

public enum TokenType {

    VAR, IF, ELSE, INT, FLOAT, STRING, TRUE, FALSE,

    PLUS,         // +
    MINUS,        // -
    STAR,         // *
    SLASH,        // /
    PERCENT,      // %

    EQUAL_EQUAL,  // ==
    BANG_EQUAL,   // !=
    LESS,         // <
    GREATER,      // >
    LESS_EQUAL,   // <=
    GREATER_EQUAL,// >=

    AND,          // and
    OR,           // or
    BANG,         // !

    EQUAL,        // =

    IDENTIFIER,
    NUMBER,
    STRING_LITERAL,

    LPAREN,       // (
    RPAREN,       // )
    LBRACE,       // {
    RBRACE,       // }
    SEMICOLON,    // ;
    COLON,        // :

    EOF
}
