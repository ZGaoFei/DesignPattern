package com.example.designpattern.test_code.mediator;

public class MediatorPatternMain {

    public static void main(String[] args) {
        User one = new User("one");
        User two = new User("two");

        one.sendMessage("hello two!!!");
        two.sendMessage("hi one!!!");
    }
}
