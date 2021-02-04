package com.czw;

public class Main {
    public static void main(String[] args) {
        Service service1 = ServiceLocator.getService("service1");
        service1.execute();
        Service service2 = ServiceLocator.getService("service1");
        service2.execute();
        Service service3 = ServiceLocator.getService("service1");
        service3.execute();
        Service service4 = ServiceLocator.getService("service2");
        service4.execute();
        Service service5 = ServiceLocator.getService("service2");
        service5.execute();
        Service service6 = ServiceLocator.getService("service2");
        service6.execute();
    }
}
