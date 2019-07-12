package com.example.designpattern.test_code.abstract_factory.factory;

import com.example.designpattern.test_code.abstract_factory.factory_class.Color;
import com.example.designpattern.test_code.abstract_factory.factory_class.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
