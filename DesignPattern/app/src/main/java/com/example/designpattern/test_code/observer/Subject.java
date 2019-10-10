package com.example.designpattern.test_code.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> list = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
