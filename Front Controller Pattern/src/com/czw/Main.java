package com.czw;

public class Main {
    public static void main(String[] args) {
        FontController fontController = new FontController();
        fontController.dispatchRequest("Student");
        fontController.dispatchRequest("Home");
    }
}
