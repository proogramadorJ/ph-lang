package com.pedrodev;

import com.pedrodev.interpreter.AstTreePrinter;
import com.pedrodev.lexer.Token;
import com.pedrodev.lexer.Tokenizer;
import com.pedrodev.paser.Expr;
import com.pedrodev.paser.Parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ph {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\pedro\\Desenvolvimento\\desktop\\ph-lang\\test\\lexer.ph");
        String sourceCode = Files.readString(path);

        Tokenizer tokenizer = new Tokenizer(sourceCode);
        List<Token> tokens = tokenizer.scanTokens();
        Parser parser = new Parser(tokens);
        Expr ast = parser.parse();


        System.out.println(new AstTreePrinter().print(ast));

    }
}