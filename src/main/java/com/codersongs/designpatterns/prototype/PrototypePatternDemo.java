package com.codersongs.designpatterns.prototype;

/**
 * 原型模式
 * <p>
 * 原型模式主要解决的问题是消耗资源的对象的创建，在java中的主要体现为对<code>Cloneable</code>
 * 的实现。
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.load();
        Shape circle = ShapeCache.getShape("1");
        circle.draw();

        Shape rectangle = ShapeCache.getShape("2");
        rectangle.draw();

        Shape square = ShapeCache.getShape("3");
        square.draw();
    }
}
