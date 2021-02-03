package com.czw;

public class Main {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);

        client.businessDelegate.setServiceName("service1");
        client.businessDelegate.doTask();

        client.businessDelegate.setServiceName("service2");
        client.businessDelegate.doTask();
    }
}
