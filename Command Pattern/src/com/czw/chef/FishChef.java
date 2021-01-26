package com.czw.chef;

import com.czw.chef.Chef;

public class FishChef implements Chef {
    @Override
    public void cook() {
        System.out.println("烧了一条鱼");
    }
}
