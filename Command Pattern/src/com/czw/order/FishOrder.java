package com.czw.order;

import com.czw.chef.Chef;

public class FishOrder implements Order{
    private Chef fishChef;

    public FishOrder(Chef fishChef) {
        this.fishChef = fishChef;
    }

    @Override
    public void execute() {
        fishChef.cook();
    }
}
