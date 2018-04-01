package com.codersongs.designpatterns.observer;

public abstract class Observer {
    protected Subject subject;
    protected abstract void update();
}
