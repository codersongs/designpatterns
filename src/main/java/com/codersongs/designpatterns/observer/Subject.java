package com.codersongs.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int state;
    private List<Observer> observerList = new ArrayList<Observer>();

    public Subject() {
        notifyAllObservers();
    }

    public void attach(Observer observer){
        this.observerList.add(observer);
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public int getState() {
        return state;
    }

    public void notifyAllObservers(){
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
