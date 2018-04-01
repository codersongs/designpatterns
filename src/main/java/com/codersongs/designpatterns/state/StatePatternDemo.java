package com.codersongs.designpatterns.state;

/**
 * 状态模式:
 * <p>
 * 状态模式一一种将对象的不同状态分离出来，封装成类，用于行为随着状态的改变而改变，可作为if switch
 * 的替换
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        State stopState = new StopState();

        startState.doAction(context);
        stopState.doAction(context);
    }
}
