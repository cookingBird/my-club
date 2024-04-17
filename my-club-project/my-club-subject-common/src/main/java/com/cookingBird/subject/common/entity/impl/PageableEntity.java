package com.cookingBird.subject.common.entity.impl;

import com.cookingBird.subject.common.entity.able.IPageable;
import lombok.Data;

import java.io.Serializable;

@Data
public class PageableEntity implements IPageable {
    private Integer pageNo;
    private Integer pageSize;
}
