package com.example.designpattern.test_code.builder;


public class BuilderPatternMain {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal meal = builder.prepareVugMeal();
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());

        Meal noVugMeal = builder.prepareNoVugMeal();
        noVugMeal.showItems();
        System.out.println("Total cost: " + noVugMeal.getCost());

        Meal burger = builder.prepareOnlyVugBurger();
        burger.showItems();
        System.out.println("Total cost: " + burger.getCost());

        Meal coldDrink = builder.prepareOnlyCoke();
        coldDrink.showItems();
        System.out.println("Total cost: " + coldDrink.getCost());
    }

}
