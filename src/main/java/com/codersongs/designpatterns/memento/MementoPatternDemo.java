package com.codersongs.designpatterns.memento;

/**
 * 备忘录模式:保存一个对象的状态，以便在某个时候恢复
 * <p>
 * 备忘录模式是一种解决问题的模式，主要解决对象状态的存储回滚问题，起到一种后悔药的作用
 * <p>
 * 使用场景:1.保存恢复数据，2.提供一个回滚的操作
 * <p>
 * 注意事项:<br/>
 * 1.为了符合迪米特法则，需要一个备忘录管理类<br/>
 * 2.为了节约内存，可以使用原型+备忘录模式
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator("1");
        CareTaker careTaker = new CareTaker();

        originator.setState("2");
        originator.setState("3");

        careTaker.add(originator.saveStateToMemento());
        originator.setState("4");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("5");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("6");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemonto(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemonto(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
