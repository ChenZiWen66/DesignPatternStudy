package com.czw;

public class SingleObject {
    private static SingleObject singleInstance = new SingleObject();
    private SingleObject(){};

    public static SingleObject getInstance(){
        return singleInstance;
    }

    public void sayHello(){
        System.out.print("HEllo");
    }
}
