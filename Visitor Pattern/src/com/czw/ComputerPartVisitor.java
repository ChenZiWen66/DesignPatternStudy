package com.czw;

public interface ComputerPartVisitor {
    void visit(KeyBoard keyBoard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
}
