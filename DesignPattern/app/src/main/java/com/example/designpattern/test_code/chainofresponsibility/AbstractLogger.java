package com.example.designpattern.test_code.chainofresponsibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger abstractLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        abstractLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (abstractLogger != null) {
            abstractLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
