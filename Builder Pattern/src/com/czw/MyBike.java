package com.czw;

import com.czw.entity.*;

public class MyBike {
    private Itire tire;
    private Iframe frame;
    private Iseat seat;
    private MyBike(Builder builder){
        this.seat = builder.seat;
        this.tire = builder.tire;
        this.frame = builder.frame;
    }
    public void showBike(){
        this.frame.getName();
        this.tire.getName();
        this.seat.getName();
    }

    public static class Builder {
        private Itire tire;
        private Iframe frame;
        private Iseat seat;

        public Builder(){};
        public Builder setTire(Itire tire){
            this.tire= tire;
            return this;
        }
        public Builder setFrame(Iframe frame){
            this.frame= frame;
            return this;
        }
        public Builder setSeat(Iseat seat){
            this.seat= seat;
            return this;
        }
        public MyBike build(){
            return new MyBike(this);
        }
    }
}
