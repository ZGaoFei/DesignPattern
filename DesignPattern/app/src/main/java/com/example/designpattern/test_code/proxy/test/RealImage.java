package com.example.designpattern.test_code.proxy.test;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("display a real image!!!");
    }

    private void loadFromDisk(String fileName) {
        System.out.println("load " + fileName + " image from disk!!!");
    }
}
