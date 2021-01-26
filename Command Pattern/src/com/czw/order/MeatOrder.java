package com.czw.order;

import com.czw.chef.Chef;

public class MeatOrder implements Order {
    private Chef meatChef;

    public MeatOrder(Chef meatChef) {
        this.meatChef = meatChef;
    }

    @Override
    public void execute() {
        meatChef.cook();
    }
}
