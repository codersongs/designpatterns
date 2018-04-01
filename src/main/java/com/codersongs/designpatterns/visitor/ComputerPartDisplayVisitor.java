package com.codersongs.designpatterns.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    public void visit(Mouse mouse) {
        System.out.println("Display mouse");
    }

    public void visit(Computer computer) {
        System.out.println("Display computer");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Display keyboard");
    }

    public void visit(Monitor monitor) {
        System.out.println("Display monitor");
    }
}
