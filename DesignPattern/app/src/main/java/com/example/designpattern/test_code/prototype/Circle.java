package com.example.designpattern.test_code.prototype;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("======draw a circle========");
    }
}
