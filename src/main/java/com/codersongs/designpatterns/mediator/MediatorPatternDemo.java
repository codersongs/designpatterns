package com.codersongs.designpatterns.mediator;

/**
 * 中介者模式
 * <p>
 * 中介者模式主要解决的是对象之间存在大量的网状关联关系，中介者的存在使得网状关系变为星壮关系
 * 解除了对象之间的复杂耦合，使各自的扩展变得容易，符合迪米特法则(最少知道)
 * <p>
 * 中介者模式与命令模式有相似之处，并且可以发现很多行为型模式有相似之处，不同模式之间的区别主
 * 要在于使用场景和意图
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Mike");

        user.sendMessage("hello world");
    }
}
