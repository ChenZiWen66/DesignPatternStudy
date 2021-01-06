package com.czw;

public class ColorFactory implements AbstractFactory{
    @Override
    public Shape createShape(String shapeName) {
        return null;
    }

    @Override
    public Color createColor(String colorName){
        if (colorName == null) {
            return null;
        }
        if (colorName.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (colorName.equalsIgnoreCase("Blue")) {
            return new Blue();
        } else if (colorName.equalsIgnoreCase("Pink")) {
            return new Pink();
        } else {
            return null;
        }
    }
}
