package com.codersongs.designpatterns.adapter;

/**
 * 适配者模式
 * <p>
 * 适配者模式主要包括三种类型:
 * <ul>
 *     <li>1.类适配器</li>
 *     <li>2.对象适配器</li>
 *     <li>3.接口适配器模式</li>
 * </ul>
 * <p>
 * 类适配器采用的继承的方式，复用被是配置的方法，而对象适配器是使用组合的方式，复用被适配者的方法
 * 接口适配器又被称为缺省适配器，在要实现接口有不想实现所有实现方法的时候，可以混用一个抽象类来实
 * 现所有方法，然后子类集成该抽象类后选择必要方法实现
 * <p>
 * 适配器模式是维护代码所使用的模式，而不是在最初设计时使用的模式
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        //类适配器
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.request();
        //对象适配器
        ObjectAdapter objectAdapter = new ObjectAdapter();
        objectAdapter.request();
        //接口适配器
        InterfaceAdapter listener1 = new Listener1();
        InterfaceAdapter listener2 = new Listener2();
        listener1.request();
        listener2.request2();
    }
}
