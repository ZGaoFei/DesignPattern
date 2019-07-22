package com.example.designpattern.test_code.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("======draw a rectangle========");
    }
}
