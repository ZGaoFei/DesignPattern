package com.example.designpattern.test_code.visitor;

public class Computer implements ComputerPart {

    private ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[]{new Keyboard(), new Monitor(), new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (int i = 0; i < computerParts.length; i++) {
            computerParts[i].accept(visitor);
        }
        visitor.visit(this);
    }

}
