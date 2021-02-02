package com.czw;

public class OldPeople implements ComputerPartVisitor {
    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("两根手指敲");
        keyBoard.spell();
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("凑近看");
        monitor.watchImage();
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("滑动鼠标");
        mouse.click();
    }
}
