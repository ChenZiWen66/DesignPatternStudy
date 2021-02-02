package com.czw;

public class KeyBoard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    /**
     * 打字功能
     */
    public void spell(){
        System.out.println("打字");
    }

    /**
     * 打人功能
     */
    public void hit(){
        System.out.println("打人");
    }
}
