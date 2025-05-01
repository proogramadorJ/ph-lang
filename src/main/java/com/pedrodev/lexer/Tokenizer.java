package com.pedrodev.lexer;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {

    private int pos = 0;
    private int line = 1, column = 1;
    private final List<Token> tokens = new ArrayList<>();
    private final String sourceCode;


    public Tokenizer(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public List<Token> scanTokens() {
        while (pos < sourceCode.length()) {
            char currentChar = sourceCode.charAt(pos);

            switch (currentChar) {
                case '+':
                    tokens.add(new Token(TokenType.PLUS, String.valueOf(currentChar), null, line, column++));
                    pos++;
                    break;
                case '-':
                    tokens.add(new Token(TokenType.MINUS, String.valueOf(currentChar), null, line, column++));
                    pos++;
                    break;
                case '*':
                    tokens.add(new Token(TokenType.STAR, String.valueOf(currentChar), null, line, column++));
                    pos++;
                    break;
                case '/':
                    tokens.add(new Token(TokenType.SLASH, String.valueOf(currentChar), null, line, column++));
                    pos++;
                    break;
                case ' ':
                    column++;
                    pos++;
                    break;
                case '\r':
                    if (pos + 1 < sourceCode.length() && sourceCode.charAt(pos + 1) == '\n') {
                        pos += 2;
                    } else {
                        pos++;
                    }
                    line++;
                    column = 1;
                    break;
                case '\n':
                    line++;
                    column = 1;
                    pos++;
                    break;
                default:
                    if (isNumber(currentChar)) {
                        int startColumn = column;
                        StringBuilder numberLiteral = new StringBuilder();
                        while (pos < sourceCode.length() && isNumber(sourceCode.charAt(pos))) {
                            numberLiteral.append(sourceCode.charAt(pos));
                            pos++;
                            column++;
                        }
                        tokens.add(new Token(TokenType.NUMBER, numberLiteral.toString(), Integer.parseInt(numberLiteral.toString()), line, startColumn));
                    } else {
                        throw new RuntimeException("Unkown char " + currentChar + " at line " + line + " column " + column++);
                    }

            }
        }

        tokens.add(new Token(TokenType.EOF, null, null, -1, -1));

        return tokens;
    }

    private boolean isNumber(char currentChar) {
        return currentChar >= 48 && currentChar <= 57;
    }
}
