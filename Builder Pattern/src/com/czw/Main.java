package com.czw;

import com.czw.entity.AlloyFrame;
import com.czw.entity.Bike;
import com.czw.entity.InflateTire;
import com.czw.entity.RubberSeat;

public class Main {
    public static void main(String[] args) {
//        showBike(new OfoBuilder());
//        showBike(new MobikeBuilder());
        MyBike myBike = new MyBike.Builder()
                .setFrame(new AlloyFrame())
                .setSeat(new RubberSeat())
                .setTire(new InflateTire())
                .build();
        myBike.showBike();
    }

    private static void showBike(Builder builder){
        Director director = new Director(builder);
        Bike bike = director.construct();
        bike.getFrame().getName();
        bike.getSeat().getName();
        bike.getTire().getName();
    }
}
