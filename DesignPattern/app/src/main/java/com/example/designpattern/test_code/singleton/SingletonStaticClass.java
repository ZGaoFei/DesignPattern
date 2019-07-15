package com.example.designpattern.test_code.singleton;

/**
 * 静态内部类方式
 * 静态内部类会延迟装载
 */
public class SingletonStaticClass {

    private SingletonStaticClass() {}

    private static class SingleHolder {
        private static final SingletonStaticClass instance = new SingletonStaticClass();
    }

    public static final SingletonStaticClass getInstance() {
        return SingleHolder.instance;
    }

    public void print() {
        System.out.println("=====singleton==static class====");
    }
}
