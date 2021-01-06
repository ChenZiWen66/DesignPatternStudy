package com.czw;

public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory colorFactory = factoryProducer.createFactory("ColorFactory");
        AbstractFactory shapeFactory = factoryProducer.createFactory("ShapeFactory");
        Color red = colorFactory.createColor("red");
        red.getColor();
        Color blue = colorFactory.createColor("blue");
        blue.getColor();
        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw();
        Shape triangle = shapeFactory.createShape("triangle");
        triangle.draw();
    }
}
