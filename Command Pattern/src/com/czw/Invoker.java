package com.czw;

import com.czw.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<Order> orderList = new ArrayList<>();

    void addOrder(Order order) {
        orderList.add(order);
    }

    void execute() {
        for (Order order : orderList) {
            order.execute();
            System.out.println("记账");
        }
        orderList.clear();
    }
}
