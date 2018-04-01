package com.codersongs.designpatterns.flyweight;

public class Circle implements Shape{
    private int x,y,radius;
    private String color;
    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
