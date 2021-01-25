package com.czw;

public class Circle implements Shape {
    public String color;
    public String radius;

    public Circle(String color) {
        this.color = color;
        this.radius = "10";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("这是一个圆，颜色是" + color + ",半径是" + radius);
    }
}
