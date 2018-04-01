package com.codersongs.designpatterns.bridge;

public class DrawRedCircle implements DrawAPI{
    public void draw(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
