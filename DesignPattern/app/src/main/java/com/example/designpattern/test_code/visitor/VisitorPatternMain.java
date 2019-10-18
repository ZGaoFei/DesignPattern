package com.example.designpattern.test_code.visitor;

public class VisitorPatternMain {

    public static void main(String[] args) {
//        ComputerPart part = new Computer();
//        part.accept(new ComputerDisplayVisitor());

        ComputerPart part1 = new Keyboard();
        part1.accept(new ComputerDisplayVisitor());
    }
}
