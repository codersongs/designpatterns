package com.codersongs.designpatterns.adapter;

public class Listener1 extends InterfaceAdapter{
    @Override
    public void request() {
        System.out.println("special request 1");
    }
}
