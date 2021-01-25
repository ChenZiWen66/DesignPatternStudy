package com.czw;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static ShapeFactory shapeFactoryInstance;
    private Map<String, Shape> ShapeMap = new HashMap<>();

    private ShapeFactory() {
    }

    public static ShapeFactory getFactory() {
        if (shapeFactoryInstance == null) {
            shapeFactoryInstance = new ShapeFactory();
        }
        return shapeFactoryInstance;
    }

    public Circle makeCircle(String color) {
        if (shapeFactoryInstance.ShapeMap.containsKey(color)) {
            return (Circle) shapeFactoryInstance.ShapeMap.get(color);
        } else {
            Circle circle = new Circle(color);
            shapeFactoryInstance.ShapeMap.put(color, circle);
            return circle;
        }
    }
}
