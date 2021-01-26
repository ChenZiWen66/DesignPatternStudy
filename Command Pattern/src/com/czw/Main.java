package com.czw;

import com.czw.chef.FishChef;
import com.czw.order.FishOrder;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        FishOrder fishOrder = new FishOrder(new FishChef());
        invoker.addOrder(fishOrder);
        invoker.execute();
    }
}
