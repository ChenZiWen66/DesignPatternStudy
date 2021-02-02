package com.czw;

public class StarCraft extends Game {
    @Override
    public void initialResource() {
        System.out.println("初始化兵种模型");
        System.out.println("初始化地图");
        System.out.println("初始化语音");
    }

    @Override
    public void run() {
        System.out.println("星际争霸正在运行");
    }

    @Override
    public void end() {
        System.out.println("星际争霸结束了");
    }
}
