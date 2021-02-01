package com.czw;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("十六进制:"+Integer.toHexString(subject.getState()));
    }
}
