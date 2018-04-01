package com.codersongs.designpatterns.abstractfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("color");
        Color color = abstractFactory.getColor("red");
        color.fill();
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
