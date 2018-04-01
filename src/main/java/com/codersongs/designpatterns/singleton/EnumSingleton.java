package com.codersongs.designpatterns.singleton;

/**
 * 使用枚举的方式创建单例对象
 * <p>
 *     懒加载:否<br/>
 *     线程安全:是<br/>
 *     适用于反序列化的情况，在反序列化创建单例对象的情况下，可以避免重复创建
 * </p>
 */
public enum  EnumSingleton {
    INSTANCE;

    public void showMessage(){
        System.out.println(this.getClass().getName());
    }
}
