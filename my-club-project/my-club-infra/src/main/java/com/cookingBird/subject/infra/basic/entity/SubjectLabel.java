package com.cookingBird.subject.infra.basic.entity;

import com.cookingBird.subject.common.entity.able.ISortable;
import com.cookingBird.subject.common.entity.impl.BaseEntity;
import com.cookingBird.subject.common.entity.impl.SortableBaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SubjectLabel extends SortableBaseEntity implements ISortable, Serializable {
    private static final long serialVersionUID = 944616698926753866L;
    @ApiModelProperty(value = "主键")
    private Long id;
    @ApiModelProperty(value = "标签分类")
    private String labelName;
    @ApiModelProperty(value = "排序")
    private Integer sortNum;
}
