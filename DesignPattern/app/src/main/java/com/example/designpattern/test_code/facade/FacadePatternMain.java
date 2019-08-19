package com.example.designpattern.test_code.facade;

public class FacadePatternMain {

    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();

        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
