package com.czw.order;

import com.czw.chef.MeatChef;

public class MeatOrder implements Order {
    private MeatChef meatChef;

    public MeatOrder(MeatChef meatChef) {
        this.meatChef = meatChef;
    }

    @Override
    public void execute() {
        meatChef.cook();
    }
}
