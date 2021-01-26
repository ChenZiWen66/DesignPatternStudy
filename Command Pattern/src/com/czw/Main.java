package com.czw;

import com.czw.chef.Chef;
import com.czw.chef.FishChef;
import com.czw.order.FishOrder;
import com.czw.order.Order;

public class Main {
    public static void main(String[] args) {
        Chef fishChef = new FishChef();
        Invoker invoker = new Invoker();

        Order fishOrder = new FishOrder(fishChef);//创建一个烧鱼命令
        invoker.addOrder(fishOrder);//传达者添加命令
        invoker.execute();//传达者执行命令
    }
}
