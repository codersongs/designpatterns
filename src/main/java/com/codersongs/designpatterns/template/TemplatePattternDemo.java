package com.codersongs.designpatterns.template;

/**
 * 模板模式
 * <p>
 * 模板模式是一种将算法或者执行顺序确定下来封装到基类中，具体实现细节由子类实现从而有效的协调了
 * 变化和不变的关系，即封装不变，扩展变化
 * <p>
 * 优点：
 * <ul>
 *     <li>封装不变部分，扩展可变部分</li>
 *     <li>提取公共方法，利于维护</li>
 *     <li>行为由父类控制，子类实现</li>
 * </ul>
 * <p>
 * 为了防止子类恶意修改父类方法，一般将不变部分的封装方法由final修饰符进行约束
 */
public class TemplatePattternDemo {
    public static void main(String[] args) {
        Game football = new Football();
        Game basketball = new Basketeball();

        football.play();
        basketball.play();
    }
}
