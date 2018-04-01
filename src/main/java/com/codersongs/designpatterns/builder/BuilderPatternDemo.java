package com.codersongs.designpatterns.builder;

/**
 * 构建者模式
 * <p>构建者模式的核心在于:构建一个对象(在本例中为汉堡套餐)的整体过程是一致的，都是先准备汉堡
 * 再准备饮料，并且汉堡和饮料都需要准备原料和打包，具体拆分如下:</p>
 * <p>builder:addBurger->addColdDrink->meal(导演)<br/>
 *    burger:item packing(wrapper) price<br/>
 *    coldDrink:item packing(bottle) price<br/>
 *    因此可以抽象出Item和packing两个接口，其中burger和cold又各自分为不同种类
 * </p>
 * <p>使用场景:一些基本部件不变，但其组合经常变化,
 *    如何解决:将变与不变分离:不变体现有三点:
 *    1.构建者构建的步骤，
 *    2.导演管理的事例的依赖
 *    3.部件的组成元素</p>
 *  <p>
 *      与工厂模式的主要区别:建造者模式更加注重于零件装配的顺序
 *  </p>
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println(vegMeal.getCost());
        vegMeal.showItems();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println(nonVegMeal.getCost());
        nonVegMeal.showItems();
    }
}
