package com.czw;

public class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("这是笔记本");
    }
}
