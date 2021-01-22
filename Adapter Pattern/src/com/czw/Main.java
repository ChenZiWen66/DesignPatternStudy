package com.czw;

public class Main {
    public static void main(String[] args) {
        OldTV oldTV = new Adapter();
        oldTV.playIn200V();
    }
}
