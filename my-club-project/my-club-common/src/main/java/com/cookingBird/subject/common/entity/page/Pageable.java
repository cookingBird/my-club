package com.cookingBird.subject.common.entity.page;

import lombok.Data;

import java.io.Serializable;

@Data
public class Pageable implements Serializable {
    private Integer pageNo;
    private Integer pageSize;
}
