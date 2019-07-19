package com.example.designpattern.test_code.builder.content;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10f;
    }
}
