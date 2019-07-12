package com.example.designpattern.test_code.abstract_factory.factory;

import com.example.designpattern.test_code.abstract_factory.factory_class.Blue;
import com.example.designpattern.test_code.abstract_factory.factory_class.Color;
import com.example.designpattern.test_code.abstract_factory.factory_class.Green;
import com.example.designpattern.test_code.abstract_factory.factory_class.Red;
import com.example.designpattern.test_code.abstract_factory.factory_class.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color.equals("Red")) {
            return new Red();
        } else if (color.equals("Blue")) {
            return new Blue();
        } else if (color.equals("Green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
