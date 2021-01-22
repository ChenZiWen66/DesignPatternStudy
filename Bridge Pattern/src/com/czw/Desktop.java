package com.czw;

public class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("这是台式机");
    }
}
