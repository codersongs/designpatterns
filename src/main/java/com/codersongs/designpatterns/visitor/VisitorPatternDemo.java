package com.codersongs.designpatterns.visitor;

/**
 * 访问者模式
 * <p>
 * 访问者模式解决的问题是稳定的数据结构和多变的算法(操作)的耦合问题
 * <p>
 * 访问者模式的核心代码是元素(数据结构)类通过accept方法接受一个visitor对象，通过visitor对象
 * 的变化来实现操作的变化，visitor可以通过实现接口任意扩展和修改
 * <p>
 * 如果需要遍历才能完成访问者的操作，通常需要一个ObjectStruture持有元素的集合，并接受访问者对象
 * 使访问者访问每一个元素，获取每一个对象的数据做出相应操作
 * <p>
 *
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerPartDisplayVisitor computerPartDisplayVisitor = new ComputerPartDisplayVisitor();

        computer.accept(computerPartDisplayVisitor);
    }
}
