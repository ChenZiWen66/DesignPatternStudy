package com.czw;

/**
 * 粗粒度对象
 */
public class CoarseGainedObject {
    private DependentObject1 dependentObject1 = new DependentObject1();
    private DependentObject2 dependentObject2 = new DependentObject2();

    public String[] getData() {
        return new String[]{dependentObject1.getData(), dependentObject2.getData()};
    }

    public void setData(String string1, String string2) {
        dependentObject1.setData(string1);
        dependentObject2.setData(string2);
    }
}
