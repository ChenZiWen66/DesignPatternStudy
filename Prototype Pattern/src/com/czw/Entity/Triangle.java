package com.czw.Entity;


public class Triangle extends Shape {
    public Triangle() {
        type = "Triangle";
    }

    @Override
    void draw() {
        System.out.println("画了一个三角形");
    }
}
