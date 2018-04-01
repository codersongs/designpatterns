package com.codersongs.designpatterns.interpreter;

/**
 * 解释器模式
 * <p>
 * 解释器模式主要用于语义处理，如SQL解析，符号处理引擎？？？
 * <p>
 * 方便扩展解析，但在java中应用场景较少，可用框架expression4j
 */
public class InterpreterPatternDemo {

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert, john);
    }

    public static  Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julia");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(julie, married);
    }
    public static void main(String[] args) {
        Expression maleExpression = getMaleExpression();

        Expression marriedWomanExpression = getMarriedWomanExpression();

        System.out.println("John is male?" + maleExpression.interpret("John"));
        System.out.println("Jack is male?" + maleExpression.interpret("Jack"));

        System.out.println("Julia is a married woman?" + marriedWomanExpression.interpret("Julia"));
        System.out.println("Julia is a married woman?" + marriedWomanExpression.interpret("Married Julia"));
        System.out.println("Julia is a married woman?" + marriedWomanExpression.interpret("Julia Married"));

    }
}
