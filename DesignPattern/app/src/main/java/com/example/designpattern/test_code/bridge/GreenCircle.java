package com.example.designpattern.test_code.bridge;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw a green circle, radius: " + radius + " location: (" + x + ", " + y + ")");
    }
}
