package com.example.designpattern.test_code.bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 20, 40, new RedCircle());
        redCircle.draw();

        Shape greenCircle = new Circle(40, 50, 30, new GreenCircle());
        greenCircle.draw();
    }
}
