package com.example.designpattern.test_code.chainofresponsibility;

public class ChainOfResponsibilityPatternMain {

    public static void main(String[] args) {
//        AbstractLogger chainOfLogger = getChainOfLogger();
//
//        chainOfLogger.logMessage(AbstractLogger.DEBUG, "debug information");
//        System.out.println();
//        chainOfLogger.logMessage(AbstractLogger.INFO, "info information");
//        System.out.println();
//        chainOfLogger.logMessage(AbstractLogger.ERROR, "error information");

        // =======================================================

        AbstractLogger errorLogger = new ErrorLogger();

        errorLogger.logMessage(3, "error information");
        System.out.println();
        errorLogger.logMessage(2, "debug information");
        System.out.println();
        errorLogger.logMessage(1, "info information");
    }

    private static AbstractLogger getChainOfLogger() {
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
