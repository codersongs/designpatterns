package com.codersongs.designpatterns.strategy;

/**
 * 策略模式，一个类的行为或算法可以在运行时修改
 * <p>
 * 策略模式同命令模式，状态模式一样，也是作为if else的一种替代，这种模式有共同的优点，那就是，解耦
 * 具体实现和调用，避免了多层if else的繁琐，同时也带来了类爆炸的问题
 * <p>
 * 如果一个系统中的同一种策略超过四个，就要考虑使用混合模式，解决类爆炸的问题
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        AddStrategy addStrategy = new AddStrategy();
        SubStrategy subStrategy = new SubStrategy();
        MultiStrategy multiStrategy = new MultiStrategy();

        Context contextAdd = new Context(addStrategy);
        Context contextSub = new Context(subStrategy);
        Context contextMulti = new Context(multiStrategy);

        int num1 = 2;
        int num2 = 1;
        System.out.println(contextAdd.executeStrategy(num1, num2));
        System.out.println(contextSub.executeStrategy(num1, num2));
        System.out.println(contextMulti.executeStrategy(num1, num2));
    }
}
