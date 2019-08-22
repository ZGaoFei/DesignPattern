package com.example.designpattern.test_code.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        level = 3;
        setNextLogger(new FileLogger());
    }

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Error::Logger: " + message);
    }
}
