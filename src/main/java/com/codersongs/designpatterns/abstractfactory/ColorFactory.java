package com.codersongs.designpatterns.abstractfactory;

public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (null == colorType){
            return null;
        }
        if ("red".equals(colorType)){
            return new Red();
        }else if ("yellow".equals(colorType)){
            return new Yellow();
        }else if ("blue".equals(colorType)){
            return  new Blue();
        }
        return null;
    }
}
