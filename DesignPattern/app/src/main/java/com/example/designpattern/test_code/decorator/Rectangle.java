package com.example.designpattern.test_code.decorator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("shape: draw a rectangle!!!");
    }
}
