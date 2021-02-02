package com.czw;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    /**
     * 鼠标的砸人功能
     */
    public void hit(){
        System.out.println("砸人");
    }

    /**
     * 鼠标的点击功能
     */
    public void click(){
        System.out.println("点击");
    }
}
