package com.czw;

import com.czw.entity.AlloyFrame;
import com.czw.entity.Bike;
import com.czw.entity.DermisSeat;
import com.czw.entity.SolidTire;

public class MobikeBuilder extends Builder {
    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame(new AlloyFrame());
    }

    @Override
    void buildTire() {
        mBike.setTire(new SolidTire());
    }

    @Override
    void buildSeat() {
        mBike.setSeat(new DermisSeat());
    }

    @Override
    Bike createBike() {
        return mBike;
    }
}
