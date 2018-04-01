package com.codersongs.designpatterns.state;

public class StartState implements State{
    public void doAction(Context context) {
        System.out.println("The player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
