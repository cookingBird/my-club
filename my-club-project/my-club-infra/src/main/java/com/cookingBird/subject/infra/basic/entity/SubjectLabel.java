package com.cookingBird.subject.infra.basic.entity;

import com.cookingBird.subject.common.entity.BaseEntity;
import lombok.Data;
import java.io.Serializable;


@Data
public class SubjectLabel extends BaseEntity implements Serializable {

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
    /**
     * 排序
     */
    private Integer sortNum;

}
