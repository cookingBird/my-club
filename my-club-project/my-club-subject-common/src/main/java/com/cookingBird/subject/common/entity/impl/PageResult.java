package com.cookingBird.subject.common.entity.impl;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResult<T> {
    private Integer pageNo;
    private Integer pageSize;
    private Integer total;
    private List<T> data;
}
