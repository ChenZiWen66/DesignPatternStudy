package com.czw;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("czw","18cm");
        client.printData();
        client.setData("jbh","20cm");
        client.printData();
    }
}
