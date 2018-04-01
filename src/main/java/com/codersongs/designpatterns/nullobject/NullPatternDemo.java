package com.codersongs.designpatterns.nullobject;

/**
 * 空对象模式
 * <p>
 * 空对象模式不是gang of four所提出的23中设计模式的一种，而是一种约定俗成的用法
 * 永NullObject取代Null进行空值检查，使得检测结果更加清晰明白，同时不会有空指针的问题
 */
public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
