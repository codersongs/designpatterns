package com.codersongs.designpatterns.visitor;

public class Mouse implements ComputerPart{
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
