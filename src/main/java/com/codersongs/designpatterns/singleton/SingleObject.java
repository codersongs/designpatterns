package com.codersongs.designpatterns.singleton;

/**
 * <p>饿汉式最常用的单例模式</p>
 * <p>
 *     是否懒加载:否<br/>
 *     是否线程安全:是
 * </p>
 * <p>有两个个要点
 * <ul>
 *     <li>1.私有化构造器</li>
 *     <li>2.使用静态方法返回实例</li>
 * </ul>
 * <p>
 *     优点:线程安全；实现简单；没有加锁，效率高<br/>
 *     缺点:无论是否使用，都会初始化一次对象，有可能会造成内存浪费
 * </p>
 * @author song
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Singleton!");
    }
}
