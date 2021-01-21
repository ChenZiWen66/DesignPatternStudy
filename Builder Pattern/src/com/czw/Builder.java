package com.czw;

import com.czw.entity.Bike;

public abstract class Builder {
    abstract void buildFrame();
    abstract void buildTire();
    abstract void buildSeat();
    abstract Bike createBike();
}
