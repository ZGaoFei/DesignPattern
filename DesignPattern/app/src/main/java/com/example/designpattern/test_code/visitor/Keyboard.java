package com.example.designpattern.test_code.visitor;

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
