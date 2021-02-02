package com.czw;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    public void watchVideo() {
        System.out.println("看视频");
    }

    public void watchImage() {
        System.out.println("看图片");
    }
}
