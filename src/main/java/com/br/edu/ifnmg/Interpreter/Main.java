package com.br.edu.ifnmg.Interpreter;

public class Main {
    public static void main(String[] args) {
        ExpressionContext context = new ExpressionContext();

        context.setVariable("a", 5);
        context.setVariable("b", 10);

        Expression expression = new AddExpression(
                new NumberExpression(context.getVariable("a")),
                new NumberExpression(context.getVariable("b"))
        );

        int result = expression.interpret(context);
        System.out.println("Resultado: " + result);
    }
}
