package com.pedrodev.interpreter;

import com.pedrodev.lexer.TokenType;
import com.pedrodev.paser.Binary;
import com.pedrodev.paser.Expr;
import com.pedrodev.paser.Literal;

public class Interpreter {

     public int intepreter(Expr expr){
         if(expr instanceof Literal v){
             return Integer.parseInt(v.value().toString());
         }
         if(expr instanceof Binary){
            TokenType tokenType = ((Binary) expr).op().type();
             switch (tokenType){
                 case PLUS:
                     return intepreter(((Binary) expr).left() ) + intepreter(((Binary) expr).right());
                 case MINUS:
                     return intepreter(((Binary) expr).left() ) - intepreter(((Binary) expr).right());
                 case STAR:
                     return intepreter(((Binary) expr).left() ) * intepreter(((Binary) expr).right());
                 case SLASH:
                     return intepreter(((Binary) expr).left() ) / intepreter(((Binary) expr).right());
             }
         }
         throw new RuntimeException("Error, expression type not implemented yet");
     }


}
