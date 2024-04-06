package com.cookingBird.subject.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SortableBaseEntity extends BaseEntity implements Serializable {
    private Integer sortNum;
}
