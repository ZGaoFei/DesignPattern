package com.example.designpattern.test_code.singleton;

/**
 * 懒汉式线程不安全
 * 线程不安全
 * 懒加载的方式，在获取时创建
 */
public class SingletonLazy0 {

    private static SingletonLazy0 singleTon;

    private SingletonLazy0() {}

    public static SingletonLazy0 getInstance() {
        if (singleTon == null) {
            singleTon = new SingletonLazy0();
        }
        return singleTon;
    }

    public void print() {
        System.out.println("=====singleton0===lazy===");
    }
}
