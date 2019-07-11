package com.example.designpattern.test_code.factory;

public class AnimalFactory {

    public static Animal getAnimal(String type) {
        if (type.equals("Cat")) {
            return new Cat();
        } else if (type.equals("Dog")) {
            return new Dog();
        } else if (type.equals("Fish")) {
            return new Fish();
        } else {
            return null;
        }
    }
}
