package com.example.designpattern.test_code.factory;

public class FactoryMain {

    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("Dog");
        Animal cat = AnimalFactory.getAnimal("Cat");
        Animal fish = AnimalFactory.getAnimal("Fish");
        dog.run();
        cat.run();
        fish.run();
    }
}
