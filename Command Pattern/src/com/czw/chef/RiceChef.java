package com.czw.chef;

import com.czw.chef.Chef;

public class RiceChef implements Chef {
    @Override
    public void cook() {
        System.out.println("炒了一碗饭");
    }
}
