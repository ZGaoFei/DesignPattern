package com.example.designpattern.test_code.builder.content;

import com.example.designpattern.test_code.builder.content.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 15f;
    }
}
