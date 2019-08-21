package com.example.designpattern.test_code.proxy.java_test;


import java.lang.reflect.Proxy;

/**
 * jdk 内带的代理
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();

        MyInvocationHandler handler = new MyInvocationHandler(subject);

        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, handler);

        proxyClass.sellBooks();
        proxyClass.speak();
    }
}
