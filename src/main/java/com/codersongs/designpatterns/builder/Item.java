package com.codersongs.designpatterns.builder;

/**
 * 组成部分
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
