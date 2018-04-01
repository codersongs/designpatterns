package com.codersongs.designpatterns.decorator;

/**
 * 装饰着父类，实现了和被装饰者同样的接口，并持有接口类型的对象，
 * 对象可以定义为protected类型，让子类使用对象的方法，或者定义为
 * private类型，让子类复用父类的方法
 */
public abstract class Skills implements Hero{
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    public void learnSkills() {
        if (hero != null) {
            hero.learnSkills();
        }
    }
}
