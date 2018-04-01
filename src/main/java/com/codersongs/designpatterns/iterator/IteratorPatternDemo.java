package com.codersongs.designpatterns.iterator;

/**
 * 迭代器模式
 * <p>
 * 更方便的遍历对象，隐藏内部细节
 *
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        Container container = new NameRepository();
        Iterator iterator = container.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
