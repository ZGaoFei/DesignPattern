package com.example.designpattern.test_code.observer.test_java_util;


import java.util.Observable;
import java.util.Observer;


public class BinaryObserver implements Observer {

    public BinaryObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject) {
            System.out.println("Binary String: " + Integer.toBinaryString(((Subject) o).getState()));
        }
    }
}
