package com.czw;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = ShapeFactory.getFactory();
        Circle circle = factory.makeCircle("red");
        Circle circle1 = factory.makeCircle("pink");
        Circle circle2 = factory.makeCircle("red");

        circle.draw();
        circle1.draw();
        circle2.draw();
    }
}
