package com.codersongs.designpatterns.singleton;

/**
 * 双检锁/双重校验锁(double-checked locking)单例模式
 * <p>有效避免了在整个方法上加锁，每一次初始化都需要获取锁的问题，提高了效率</p>
 *
 */
public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton;


    private DCLSingleton(){}

    public static DCLSingleton getInstance(){
        if (dclSingleton == null){
            synchronized (DCLSingleton.class){
                dclSingleton = new DCLSingleton();
            }
        }
        return dclSingleton;
    }

    public void getMessage(){
        System.out.println(this.getClass().getName());
    }
}
