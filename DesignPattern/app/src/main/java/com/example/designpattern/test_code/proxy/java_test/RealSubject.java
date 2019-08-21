package com.example.designpattern.test_code.proxy.java_test;

public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("sell books!");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("speak books!");
        return "zgfei";
    }
}
