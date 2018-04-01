package com.codersongs.designpatterns.memento;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemonto(Memento memento){
        this.state = memento.getState();
    }
}

