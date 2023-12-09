package com.br.edu.ifnmg.Interpreter;

public class NumberExpression implements Expression{
    private int number;

    public NumberExpression(int number){
        this.number = number;
    }

    @Override
    public int interpret(ExpressionContext context) {
        return number;
    }
}
