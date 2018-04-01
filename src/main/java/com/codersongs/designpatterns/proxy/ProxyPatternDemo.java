package com.codersongs.designpatterns.proxy;

/**
 * 代理模式
 * <p>
 * 代理模式主要是用于对象访问的控制，对对象加上一个访问层:
 * <p>
 * 代理模式与装饰者模式，适配器模式很像，他们的使用目的不同，代理模适用于对象访问控制，
 * 装饰着模式侧重于对象能力的扩展，适配器模式侧重于改变接口的能力(通过组合或扩展)
 * 与适配器模式相比:适配器模式主要改变所考虑对象的接口，而代理模式不能改变代理类的接口
 * 与装饰者模式相比:装饰者模式为了增强功能，代理模式是为了加以控制
 * <p>
 * 优点:1、职责清晰。 2、高扩展性。 3、智能化。
 * <p>
 * 经典场景:spring aop
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("good file");
        proxyImage.display();
    }
}
