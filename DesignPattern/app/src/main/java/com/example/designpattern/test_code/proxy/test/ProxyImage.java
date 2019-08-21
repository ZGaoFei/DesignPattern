package com.example.designpattern.test_code.proxy.test;


public class ProxyImage implements Image {
    private String fineName;

    private RealImage realImage;

    public ProxyImage(String fineName) {
        this.fineName = fineName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fineName);
        }
        realImage.display();
    }
}
