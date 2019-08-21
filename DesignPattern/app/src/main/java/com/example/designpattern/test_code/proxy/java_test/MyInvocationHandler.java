package com.example.designpattern.test_code.proxy.java_test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    Subject subject;

    public MyInvocationHandler(Subject realSubject) {
        this.subject = realSubject;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("user invocation handler!!!");
        if (method.getName().equals("sellBooks")) {
            int sellBooks = (int) method.invoke(subject, objects);
            System.out.println("sell book num: " + sellBooks);
            return sellBooks;
        } else if (method.getName().equals("speak")) {
            String speak = (String) method.invoke(subject, objects);
            System.out.println("speak： " + speak);
            return speak;
        }
        return null;
    }
}
