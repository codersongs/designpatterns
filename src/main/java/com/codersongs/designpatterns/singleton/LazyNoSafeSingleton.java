package com.codersongs.designpatterns.singleton;

/**
 * 懒汉式，非线程安全，懒加载
 * <p>在多线程并发初始化的时候会有多次重复加载的情况</p>
 * <p>优点:效率高；实现简单</br>?
 *    缺点:线程不安全，在多线程下无法正常使用
 * </p>
 */
public class LazyNoSafeSingleton {
    private static LazyNoSafeSingleton lazyNoSafeSingleton = null;

    private LazyNoSafeSingleton(){}

    public static LazyNoSafeSingleton getInstance(){
        if (lazyNoSafeSingleton == null) {
            lazyNoSafeSingleton = new LazyNoSafeSingleton();
        }
        return lazyNoSafeSingleton;
    }

    public void showMessage(){
        System.out.println(this.getClass().getName());
    }
}
