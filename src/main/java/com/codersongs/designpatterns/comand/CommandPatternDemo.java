package com.codersongs.designpatterns.comand;

/**
 * 命令模式:
 * <p>
 * 命令模式的目的同责任链，是用于请求者和实现者解耦
 * <p>
 * 命令模式有三种角色:调用者->命令->接受者
 * <p>
 * 同责任链模式强调执行链不同，命令模式强调对一组实现操作的封装，实际操作的执行者是接受者
 * <p>
 * 调用者持有命令引用，命令持有接受者引用
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Order buyOrder = new BuyStock(stock);
        Order sellOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrders();
    }
}
