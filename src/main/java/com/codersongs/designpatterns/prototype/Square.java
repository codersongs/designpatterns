package com.codersongs.designpatterns.prototype;

public class Square extends Shape{
    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("draw square");
    }
}
