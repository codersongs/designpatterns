package com.codersongs.designpatterns.observer;

/**
 * 观察者模式
 * <p>
 * 观察者模式主要解决一个对象和多个对象之间有依赖，当这个对象发生变化时，要通知到到所有依赖他的对象
 * 并做出修改
 * <p>
 * 优点：观察者和被观察者事抽象耦合的
 * <p>
 * 由于通过循环做出通知，因此通知环节可以做成异步的，避免一个发生故障，其他对象都无法收到通知的情况
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer binaryObserver = new BinaryObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        Observer hexaObserver = new HexaObserver(subject);

        subject.setState(1);
        subject.setState(2);
        subject.setState(3);
    }
}