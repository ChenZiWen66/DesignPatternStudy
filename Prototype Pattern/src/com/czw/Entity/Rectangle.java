package com.czw.Entity;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("画了一个长方形");
    }
}
