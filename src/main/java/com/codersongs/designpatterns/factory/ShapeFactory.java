package com.codersongs.designpatterns.factory;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return  null;
        }
        if ("circle".equals(shapeType)){
            return  new Circle();
        }else if ("square".equals(shapeType)){
            return  new Square();
        }else if ("rectangle".equals(shapeType)){
            return new Rectangle();
        }
        return null;
    }
}
