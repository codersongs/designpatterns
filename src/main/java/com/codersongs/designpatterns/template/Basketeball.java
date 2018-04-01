package com.codersongs.designpatterns.template;

public class Basketeball extends Game{
    @Override
    protected void initialize() {
        System.out.println("Initialize baseketball game");
    }

    @Override
    protected void startPlay() {
        System.out.println("start play basketball");
    }

    @Override
    protected void endPlay() {
        System.out.println("end play basketball");
    }
}
