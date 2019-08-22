package com.example.designpattern.test_code.chainofresponsibility;

public class FileLogger extends AbstractLogger {

    public FileLogger() {
        level = 2;
        setNextLogger(new ConsoleLogger());
    }

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard File::Logger: " + message);
    }
}
