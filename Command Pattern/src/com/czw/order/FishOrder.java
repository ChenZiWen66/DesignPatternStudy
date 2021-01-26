package com.czw.order;

import com.czw.chef.FishChef;

public class FishOrder implements Order{
    private FishChef fishChef;

    public FishOrder(FishChef fishChef) {
        this.fishChef = fishChef;
    }

    @Override
    public void execute() {
        fishChef.cook();
    }
}
