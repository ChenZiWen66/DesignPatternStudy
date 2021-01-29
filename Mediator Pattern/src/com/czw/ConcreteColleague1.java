package com.czw;

public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1受到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发送请求");
        mediator.relay(this);
    }
}
