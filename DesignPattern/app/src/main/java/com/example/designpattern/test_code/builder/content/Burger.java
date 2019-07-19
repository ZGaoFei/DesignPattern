package com.example.designpattern.test_code.builder.content;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
