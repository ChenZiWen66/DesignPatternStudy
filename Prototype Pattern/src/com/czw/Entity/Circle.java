package com.czw.Entity;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("画了一个圆");
    }
}
