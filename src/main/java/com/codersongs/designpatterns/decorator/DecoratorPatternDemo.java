package com.codersongs.designpatterns.decorator;

/**
 * 装饰着模式
 * <p>
 * 装饰着模式的主要作用是代替继承复用代码，从而改善了单继承和子类爆炸的问题，实现对一个实现类的
 * 动态扩展
 * <p>
 * 装饰着类和被装饰的类实现了同一个接口，从而可以对实现类进行多种程度的扩充，方便维护
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Shape redBorderCircle = new RedShapeDecorator(circle);
        redBorderCircle.draw();
        Shape redBorderRectangle = new RedShapeDecorator(new Rectangle());
        redBorderRectangle.draw();
        //通过多个对象的嵌套来实现功能的扩展
        Hero blindMonk = new BlindMonk();
        blindMonk.learnSkills();
        Hero learnSkillHero = new SkillR(new SkillE(new SkillW(new SkillQ(blindMonk, "音波/回音击"), "金钟罩/铁布衫"), "天雷破/摧筋断骨"), "猛龙摆尾");
        learnSkillHero.learnSkills();
    }
}
