package com.czw.order;

import com.czw.chef.Chef;

public class RiceOrder implements Order {
    private Chef riceChef;

    public RiceOrder(Chef riceChef) {
        this.riceChef = riceChef;
    }

    @Override
    public void execute() {
        riceChef.cook();
    }
}
