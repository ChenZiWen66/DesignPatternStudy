package com.czw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Computer {
    private List<ComputerPart> computerParts;

    public Computer() {
        this.computerParts = new ArrayList<>();
    }

    public void add(ComputerPart computerPart) {
        computerParts.add(computerPart);
    }

    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(computerPartVisitor);
        }
    }
}
