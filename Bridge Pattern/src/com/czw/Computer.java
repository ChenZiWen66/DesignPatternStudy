package com.czw;

public abstract class Computer {
    public Computer(Brand brand) {
        this.brand = brand;
    }

    private Brand brand;
    public void getInfo(){
        brand.show();
    }
}
