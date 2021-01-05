package com.czw;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("Circle");
        Shape triangle = shapeFactory.createShape("Triangle");
        Shape rectangle = shapeFactory.createShape("Rectangle");
        circle.draw();
        triangle.draw();
        rectangle.draw();
    }
}
