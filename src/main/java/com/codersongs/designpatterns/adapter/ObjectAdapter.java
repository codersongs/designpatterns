package com.codersongs.designpatterns.adapter;

public class ObjectAdapter implements Target{
    private Adaptee adaptee = new Adaptee();

    public void request2() {
        adaptee.specialRequest();
    }

    public void request() {
        adaptee.specialRequest();
    }
}
