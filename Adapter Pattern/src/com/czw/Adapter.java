package com.czw;

public class Adapter extends OldTV implements newVoltage {
    @Override
    public void playInNewVoltage() {
        System.out.println("在220v的环境下播放了电视");
    }

    @Override
    public void playIn200V() {
        this.playInNewVoltage();
    }
}
