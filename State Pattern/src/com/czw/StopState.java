package com.czw;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("执行停止状态动作,将状态设置成开始状态");
        context.setState(new StartState());
    }
}
