package com.example.designpattern.test_code.singleton;

public class SingletonMain {

    public static void main(String[] args) {

        SingletonLazy0.getInstance().print();
        System.out.println("======" + (SingletonLazy0.getInstance() == SingletonLazy0.getInstance()));

        SingletonLazy1.getInstance().print();
        System.out.println("======" + (SingletonLazy1.getInstance() == SingletonLazy1.getInstance()));

        SingletonEr.getInstance().print();
        System.out.println("======" + (SingletonEr.getInstance() == SingletonEr.getInstance()));

        SingletonDoubleCheck.getInstance().print();
        System.out.println("======" + (SingletonDoubleCheck.getInstance() == SingletonDoubleCheck.getInstance()));

        SingletonStaticClass.getInstance().print();
        System.out.println("======" + (SingletonStaticClass.getInstance() == SingletonStaticClass.getInstance()));

        SingletonEnum.INSTANCE.print();
        System.out.println("======" + (SingletonEnum.INSTANCE == SingletonEnum.INSTANCE));
    }
}
