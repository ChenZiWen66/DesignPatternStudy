package com.czw;

import com.czw.Entity.Shape;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        Shape clonedShape4 = ShapeCache.getShape("1");
        Shape clonedShape2 = ShapeCache.getShape("2");
        Shape clonedShape3 = ShapeCache.getShape("3");

        System.out.println("Shape:"+clonedShape.getType());
        System.out.println("Shape:"+clonedShape.getId());
        System.out.println("Shape:"+clonedShape2.getType());
        System.out.println("Shape:"+clonedShape3.getType());
        clonedShape.setId("999");
        System.out.println(clonedShape4.getId());
    }
}
