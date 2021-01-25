package com.czw;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape rectangle1 = new Rectangle();
        Shape rectangle2 = new Rectangle();
        circle1.draw();

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle1);
        RedShapeDecorator redShapeDecorator2 = new RedShapeDecorator(rectangle2);
        redShapeDecorator.draw();
        redShapeDecorator2.draw();
    }
}
