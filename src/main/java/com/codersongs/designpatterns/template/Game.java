package com.codersongs.designpatterns.template;

public abstract class Game {
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }

    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();
}
