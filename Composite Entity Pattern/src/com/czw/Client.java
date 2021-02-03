package com.czw;

public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("DATA:" + compositeEntity.getData()[i]);
        }
    }

    public void setData(String string1, String string2) {
        compositeEntity.setData(string1, string2);
    }
}
