package com.czw;

/**
 * 迭代器接口，判断是否有下一个，以及获取下一个的对象
 */
public interface Iterator {
    public boolean hasNext();

    public Object next();
}
