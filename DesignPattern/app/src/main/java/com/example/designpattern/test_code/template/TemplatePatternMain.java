package com.example.designpattern.test_code.template;

public class TemplatePatternMain {

    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        System.out.println();

        Game football = new Football();
        football.play();
    }
}
