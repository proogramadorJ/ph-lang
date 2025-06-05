package com.pedrodev;

import com.pedrodev.interpreter.Interpreter;
import com.pedrodev.lexer.Token;
import com.pedrodev.lexer.Tokenizer;
import com.pedrodev.paser.Expr;
import com.pedrodev.paser.Parser;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Ph {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Interpreter interpreter = new Interpreter();

        while (true) {
            System.out.print(">");
            String input = in.nextLine();
            Tokenizer tokenizer = new Tokenizer(input);
            List<Token> tokens = tokenizer.scanTokens();
            Parser parser = new Parser(tokens);
            Expr ast = parser.parse();
            System.out.println(interpreter.intepreter(ast));
        }
    }

    /**
     Path path = Path.of("C:\\Users\\pedro\\Desenvolvimento\\desktop\\ph-lang\\test\\lexer.ph");
     String sourceCode = Files.readString(path);

     System.out.println(new AstTreePrinter().print(ast));
     System.out.print(interpreter.intepreter(ast));
     **/


}