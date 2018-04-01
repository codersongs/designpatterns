package com.codersongs.designpatterns.comand;

public class SellStock implements Order{
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        this.stock.sell();
    }
}
