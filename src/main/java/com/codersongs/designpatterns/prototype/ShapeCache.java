package com.codersongs.designpatterns.prototype;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeCache = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId){
        return shapeCache.get(shapeId);
    }

    public static void load(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeCache.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeCache.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeCache.put(square.getId(), square);
    }
}
