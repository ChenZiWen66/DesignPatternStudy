package com.czw;

public interface AbstractFactory {
    public Shape createShape(String shapeName);

    public Color createColor(String colorName);
}
