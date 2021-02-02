package com.czw;

public class NaughtyKid implements ComputerPartVisitor {
    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("粗暴的使用");
        keyBoard.hit();
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("离远看");
        monitor.watchVideo();
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("粗暴的使用");
        mouse.hit();
    }
}
