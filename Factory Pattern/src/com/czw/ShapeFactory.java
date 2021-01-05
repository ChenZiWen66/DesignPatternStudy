package com.czw;

public class ShapeFactory {
    public Shape createShape(String shapeName){
        if (shapeName==null){
            return null;
        }else if (shapeName.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if (shapeName.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if (shapeName.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }else {
            return null;
        }
    }
}
