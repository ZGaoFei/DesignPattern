package com.example.designpattern.test_code.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println("Shape type: " + shape1.getType());
        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("Shape type: " + shape2.getType());
        Shape shape3 = ShapeCache.getShape("3");
        System.out.println("Shape type: " + shape3.getType());
    }

}
