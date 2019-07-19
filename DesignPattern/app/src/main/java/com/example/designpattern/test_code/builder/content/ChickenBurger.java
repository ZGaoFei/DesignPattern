package com.example.designpattern.test_code.builder.content;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 30.5f;
    }
}
