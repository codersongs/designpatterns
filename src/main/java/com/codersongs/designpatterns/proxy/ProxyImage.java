package com.codersongs.designpatterns.proxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        realImage = new RealImage(fileName);
        realImage.display();
    }
}
