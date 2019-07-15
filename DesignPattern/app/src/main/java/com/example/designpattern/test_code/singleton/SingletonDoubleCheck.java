package com.example.designpattern.test_code.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 线程安全
 */
public class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck instance;

    private SingletonDoubleCheck() {}

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("=====singleton==double check====");
    }
}
