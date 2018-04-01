package com.codersongs.designpatterns.prototype;

public class Circle extends Shape{
    public Circle() {
        this.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("draw Circle");
    }
}
