package com.cookingBird.subject.infra.basic.entity;

import com.cookingBird.subject.common.entity.SortableBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;


@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SubjectLabel extends SortableBaseEntity implements Serializable {

    /**
     * 主键
     */
    private Long id;
    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 分类id
     */
    private Long categoryId;

}
