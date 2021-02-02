package com.czw;

public class Main {
    public static void main(String[] args) {
        Game flappyBird = new FlappyBird();
        Game starCraft = new StarCraft();
        flappyBird.start();
        starCraft.start();
    }
}
