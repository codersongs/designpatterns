package com.codersongs.designpatterns.adapter;

public class ClassAdapter extends  Adaptee implements Target{
    public void request2() {
        super.specialRequest();
    }

    public void request() {
        super.specialRequest();
    }
}
