package com.codersongs.designpatterns.state;

public class StopState implements State{
    public void doAction(Context context) {
        System.out.println("The player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
