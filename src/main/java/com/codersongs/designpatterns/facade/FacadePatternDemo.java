package com.codersongs.designpatterns.facade;

/**
 * 外观模式
 * <p>
 * 将业务内部复杂的实现隐藏起来，只对外提供简单的接口，常用的如java的三层开发模式
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
