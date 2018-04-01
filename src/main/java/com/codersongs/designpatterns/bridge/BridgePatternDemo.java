package com.codersongs.designpatterns.bridge;

/**
 * 桥接模式
 * <p>
 * 桥接模式的主要作用是封装抽象和实现，从抽象类Shape中可以看出，Shape构造器和属性中都有DrawAPI
 * 这种使用方式的意图很明显，就是Shape持有的属性drawAPI由构造器传入，DrawAPI是接口，实现可以千
 * 变万化，从而实现了抽象和实现的分离。
 * <p>
 * 对面向接口编程的一种思考:
 * <ol>
 *     <li>首先接口（还有继承）提供了多态的重要体现，由此产生的实现可以千变万化</li>
 *     <li>接口提供了一种编码约束，有利于代码的维护，可以从接口的定义中弄清设计者的思路</li>
 * </ol>
 * <p>
 * 桥接模式体现的一种组合的思想，相比继承，有以下两地那好处:<br/>
 * 1.解决了java只能单继承的问题 <br/>
 * 2.避免了大量继承造成的类爆炸
 *
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(1,2,3, new DrawRedCircle());
        redCircle.draw();
        Shape greenCircle = new Circle(4,5,6,new DrawGreenCircle());
        greenCircle.draw();
    }
}
