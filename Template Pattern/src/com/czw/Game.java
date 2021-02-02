package com.czw;

public abstract class Game {
    //初始化资源
    public abstract void initialResource();

    //游戏运行
    public abstract void run();

    //游戏结束
    public abstract void end();

    public final void start() {
        initialResource();
        run();
        end();
    }
}
