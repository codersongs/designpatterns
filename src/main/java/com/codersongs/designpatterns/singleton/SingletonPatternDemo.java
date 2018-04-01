package com.codersongs.designpatterns.singleton;

/**
 * 比较多中单例模式的优缺点，有以下几个评价维度:
 *<ol>
 *     <li>是否高效，即是否加锁，锁的粒度有多大</li>
 *     <li>是否线程安全</li></li>
 *     <li>是否会造成内存浪费，即是否会懒加载</li>
 *</ol>
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //饿汉式
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
        //懒汉式，非线程安全
        LazyNoSafeSingleton lazyNoSafeSingleton = LazyNoSafeSingleton.getInstance();
        lazyNoSafeSingleton.showMessage();
        //懒汉式，线程安全
        LazySafeSingleton lazySafeSingleton = LazySafeSingleton.getInstance();
        lazySafeSingleton.showMessage();
        //双检锁，单例模式，注意volatile关键字的使用
        DCLSingleton dclSingleton = DCLSingleton.getInstance();
        dclSingleton.getMessage();
        //登记式|静态内部类式
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        staticInnerClassSingleton.showMessage();
        //枚举式，主要适用于反序列化创建对象的情况
        EnumSingleton.INSTANCE.showMessage();
    }
}
