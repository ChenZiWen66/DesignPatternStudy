package com.czw;

/**
 * 电脑组件接口(接待者类)
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
