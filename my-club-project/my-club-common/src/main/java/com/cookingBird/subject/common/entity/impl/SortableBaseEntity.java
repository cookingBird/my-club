package com.cookingBird.subject.common.entity.impl;

import com.cookingBird.subject.common.entity.able.ISortable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SortableBaseEntity extends BaseEntity implements ISortable {
    private Integer sortNum;
}
