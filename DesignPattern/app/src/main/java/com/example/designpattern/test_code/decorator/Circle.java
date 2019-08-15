package com.example.designpattern.test_code.decorator;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("shape: draw a circle!!!");
    }
}
