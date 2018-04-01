package com.codersongs.designpatterns.bridge;

public class DrawGreenCircle implements DrawAPI{
    public void draw(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
