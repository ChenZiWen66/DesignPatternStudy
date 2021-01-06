package com.czw;

public class FactoryProducer {
    public AbstractFactory createFactory(String factoryName) {
        if (factoryName == null) {
            return null;
        }
        if (factoryName.equalsIgnoreCase("ShapeFactory")) {
            return new ShapeFactory();
        } else if (factoryName.equalsIgnoreCase("ColorFactory")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
