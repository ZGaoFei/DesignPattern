package com.example.designpattern.test_code.abstract_factory.factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equals("Color")) {
            return new ColorFactory();
        } else if (choice.equals("Shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
