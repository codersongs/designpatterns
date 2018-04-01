package com.codersongs.designpatterns.observer;

public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    protected void update() {
        System.out.println("Hexa String :" + Integer.toHexString(this.subject.getState()));
    }
}
