package com.example.designpattern.test_code.singleton;

/**
 * 饿汉式
 * 本身具有线程安全特性
 * 但类加载时就创建
 */
public class SingletonEr {

    private static SingletonEr instance = new SingletonEr();

    private SingletonEr() {}

    public static SingletonEr getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("=====singleton e======");
    }
}
