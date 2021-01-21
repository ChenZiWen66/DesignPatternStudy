package com.czw;

import com.czw.entity.Bike;
import com.czw.entity.CarbonFrame;
import com.czw.entity.InflateTire;
import com.czw.entity.RubberSeat;

public class OfoBuilder extends Builder {
    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame(new CarbonFrame());
    }

    @Override
    void buildTire() {
        mBike.setTire(new InflateTire());
    }

    @Override
    void buildSeat() {
        mBike.setSeat(new RubberSeat());
    }

    @Override
    Bike createBike() {
        return mBike;
    }
}
