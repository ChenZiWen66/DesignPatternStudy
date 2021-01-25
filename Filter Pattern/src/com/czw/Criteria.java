package com.czw;

import java.util.List;

/**
 * 标准接口
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
