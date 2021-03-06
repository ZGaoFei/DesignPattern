package com.example.designpattern.test_code.interpreter;

public class AndExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression one, Expression two) {
        this.expression1 = one;
        this.expression2 = two;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
