package com.czw;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("执行开始状态动作，将状态设置成停止状态");
        context.setState(new StopState());
    }
}
