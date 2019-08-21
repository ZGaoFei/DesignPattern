package com.example.designpattern.test_code.proxy.test;

public class ProxyPatternMain {

    public static void main(String[] args) {
        Image image = new ProxyImage("hello world!.png");

        image.display();
        System.out.println("==================");
        image.display();
    }
}
