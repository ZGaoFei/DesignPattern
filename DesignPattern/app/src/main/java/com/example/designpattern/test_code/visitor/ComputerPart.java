package com.example.designpattern.test_code.visitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);
}
