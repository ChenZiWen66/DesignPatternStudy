package com.czw.chef;

import com.czw.chef.Chef;

public class MeatChef implements Chef {
    @Override
    public void cook() {
        System.out.println("烤了一块肉");
    }
}
