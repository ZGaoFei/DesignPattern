package com.example.designpattern.test_code.visitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
