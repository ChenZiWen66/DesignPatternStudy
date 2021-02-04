package com.czw;

public class Main {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);

        client.sendRequest("czw.com");
        client.sendRequest("jbh.com");
    }
}
