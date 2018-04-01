package com.codersongs.designpatterns.strategy;

public class MultiStrategy implements Strategy{
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
