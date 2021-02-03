package com.czw;

public class CompositeEntity {
    private CoarseGainedObject coarseGainedObject = new CoarseGainedObject();
    public void setData(String string1,String string2){
        coarseGainedObject.setData(string1,string2);
    }
    public String[] getData(){
        return coarseGainedObject.getData();
    }
}
