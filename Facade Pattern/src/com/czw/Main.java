package com.czw;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square();
        square.draw();

        Square square1 = new Square();
        square1.draw();

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawTriangle();
    }
}
