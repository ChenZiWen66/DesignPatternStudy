package com.czw;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape createShape(String shapeName) {
        if (shapeName == null) {
            return null;
        }
        if (shapeName.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }

    @Override
    public Color createColor(String colorName) {
        return null;
    }
}
