package com.example.designpattern.test_code.flyweight;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> shapeHashMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) shapeHashMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            shapeHashMap.put(color, circle);
        }

        return circle;
    }
}
