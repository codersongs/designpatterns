package com.codersongs.designpatterns.visitor;

public interface ComputerPartVisitor {
    public void visit(Mouse mouse);

    public void visit(Computer computer);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
