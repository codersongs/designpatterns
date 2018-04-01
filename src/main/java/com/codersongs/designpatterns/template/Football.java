package com.codersongs.designpatterns.template;

public class Football extends Game{
    @Override
    protected void initialize() {
        System.out.println("Initialize football game");
    }

    @Override
    protected void startPlay() {
        System.out.println("Start play football game");
    }

    @Override
    protected void endPlay() {
        System.out.println("End football game");
    }
}
