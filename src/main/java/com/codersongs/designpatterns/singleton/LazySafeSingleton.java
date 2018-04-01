package com.codersongs.designpatterns.singleton;

/**
 * 线程安全的懒加载单例模式
 * <p>使用了类级别的锁，大大影响了效率</p>
 */
public class LazySafeSingleton {
    private static LazySafeSingleton lazySafeSingleton;
    private LazySafeSingleton(){}

    public synchronized static LazySafeSingleton getInstance(){
        if (lazySafeSingleton == null) {
            lazySafeSingleton = new LazySafeSingleton();
        }
        return lazySafeSingleton;
    }

    public void showMessage(){
        System.out.println(this.getClass().getName());
    }
}
