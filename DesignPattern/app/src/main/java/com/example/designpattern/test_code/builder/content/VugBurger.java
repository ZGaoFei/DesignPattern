package com.example.designpattern.test_code.builder.content;


public class VugBurger extends Burger {

    @Override
    public String name() {
        return "Vug Burger";
    }

    @Override
    public float price() {
        return 25.5f;
    }

}
