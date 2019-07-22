package com.example.designpattern.test_code.prototype;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("========draw a square=======");
    }
}
