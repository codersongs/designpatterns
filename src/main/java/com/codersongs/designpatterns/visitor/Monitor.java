package com.codersongs.designpatterns.visitor;

public class Monitor implements ComputerPart{
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
