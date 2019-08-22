package com.example.designpattern.test_code.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger() {
        level = 1;
        setNextLogger(null);
    }

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
