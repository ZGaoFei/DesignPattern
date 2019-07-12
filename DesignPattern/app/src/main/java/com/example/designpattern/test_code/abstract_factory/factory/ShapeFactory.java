package com.example.designpattern.test_code.abstract_factory.factory;

import com.example.designpattern.test_code.abstract_factory.factory_class.Circle;
import com.example.designpattern.test_code.abstract_factory.factory_class.Color;
import com.example.designpattern.test_code.abstract_factory.factory_class.Rectangle;
import com.example.designpattern.test_code.abstract_factory.factory_class.Shape;
import com.example.designpattern.test_code.abstract_factory.factory_class.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape.equals("Circle")) {
            return new Circle();
        } else if (shape.equals("Rectangle")) {
            return new Rectangle();
        } else if (shape.equals("Square")) {
            return new Square();
        }
        return null;
    }
}
