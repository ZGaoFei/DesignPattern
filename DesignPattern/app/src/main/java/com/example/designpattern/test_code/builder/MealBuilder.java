package com.example.designpattern.test_code.builder;

import com.example.designpattern.test_code.builder.content.Burger;
import com.example.designpattern.test_code.builder.content.ChickenBurger;
import com.example.designpattern.test_code.builder.content.Coke;
import com.example.designpattern.test_code.builder.content.ColdDrink;
import com.example.designpattern.test_code.builder.content.Pepsi;
import com.example.designpattern.test_code.builder.content.VugBurger;

public class MealBuilder {

    public Meal prepareVugMeal() {
        Meal meal = new Meal();
        meal.addItem(new VugBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNoVugMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareOnlyVugBurger() {
        Meal meal = new Meal();
        meal.addItem(new VugBurger());
        return meal;
    }

    public Meal prepareOnlyCoke() {
        Meal meal = new Meal();
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * ......
     */
}
