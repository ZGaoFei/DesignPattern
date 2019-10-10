package com.example.designpattern.test_code.observer.test_java_util;

import java.util.Observable;

public class Subject extends Observable {

    private int state;

    public void setState(int state) {
        this.state = state;
        this.setChanged();
        this.notifyObservers();
    }

    public int getState() {
        return state;
    }

}
