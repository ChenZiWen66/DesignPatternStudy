package com.czw;

public class YoungPeople implements ComputerPartVisitor {
    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("熟练的敲");
        keyBoard.spell();
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("离远看");
        monitor.watchVideo();
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("滑动鼠标");
        mouse.click();
    }
}
