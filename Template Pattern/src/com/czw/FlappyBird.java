package com.czw;

public class FlappyBird extends Game{
    @Override
    public void initialResource() {
        System.out.println("初始化背景资源");
        System.out.println("初始化小鸟资源");
        System.out.println("初始化水管资源");
    }

    @Override
    public void run() {
        System.out.println("水管鸟游戏正在运行");
    }

    @Override
    public void end() {
        System.out.println("水管鸟游戏结束");
    }
}
