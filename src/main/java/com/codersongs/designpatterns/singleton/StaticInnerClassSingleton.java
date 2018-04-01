package com.codersongs.designpatterns.singleton;

/**
 * 登记式/静态内部类单例模式
 * <p>1.通过classloader来保证线程安全:静态内部类是私有的，只能通过方法getInstance来使用<br>
 *    2.类初始化的时候不会初始化instance对象，只有在静态方法第一次调用的时候才会初始化对象，实现了懒加载的效果
 *    3.没有锁的问题，高效
 * </p>
 */
public class StaticInnerClassSingleton {
    private static class SingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public void showMessage(){
        System.out.println(this.getClass().getName());
    }
}
