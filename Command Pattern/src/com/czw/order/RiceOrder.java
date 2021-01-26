package com.czw.order;

import com.czw.chef.RiceChef;

public class RiceOrder implements Order {
    private RiceChef riceChef;

    public RiceOrder(RiceChef riceChef) {
        this.riceChef = riceChef;
    }

    @Override
    public void execute() {
        riceChef.cook();
    }
}
