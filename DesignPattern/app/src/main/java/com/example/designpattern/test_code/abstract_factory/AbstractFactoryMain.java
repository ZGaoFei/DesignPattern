package com.example.designpattern.test_code.abstract_factory;

import com.example.designpattern.test_code.abstract_factory.factory.AbstractFactory;
import com.example.designpattern.test_code.abstract_factory.factory.FactoryProducer;
import com.example.designpattern.test_code.abstract_factory.factory_class.Color;
import com.example.designpattern.test_code.abstract_factory.factory_class.Shape;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Color red = colorFactory.getColor("Red");
        red.fill();

        Color blue = colorFactory.getColor("Blue");
        blue.fill();

        Color green = colorFactory.getColor("Green");
        green.fill();

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
