package com.example.designpattern.test_code.builder.content;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
