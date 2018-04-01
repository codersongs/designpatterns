package com.codersongs.designpatterns.filterchain;

/**
 * 责任链模式
 * <p>
 * 责任链模式是一种行为型模式，优点有:
 * <ul>
 *     <li>降低耦合度:使请求的发出者和接受者解耦，可以独立变化，接受者对请求者透明，隐藏了不必要的
 *     细节</li>
 *     <li>方便扩展:1.责任链上的一部分修改方便切对其他部分无影响，2.可以随意替换责任链的顺序
 *     3.可以根据需要增加和减少责任链上的环节</li>
 * </ul>
 * <p>
 * 应用场景:日志，Struts2 过滤器，web中的filter
 */
public class ChainPatternDemo {
    public static AbstractLogger getChain(){
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chain = getChain();

        chain.logMessage(AbstractLogger.DEBUG, "这是一条DEBUG日志");
        chain.logMessage(AbstractLogger.INFO, "这是一条INFO日志");
        chain.logMessage(AbstractLogger.ERROR, "这是一条ERROR日志");
    }
}
