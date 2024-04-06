package com.cookingBird.subject.infra.basic.entity;

import com.cookingBird.subject.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;


@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SubjectCategory extends BaseEntity implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类类型
     */
    private Integer categoryType;

    /**
     * 图标连接
     */
    private String imageUrl;

    /**
     * 父级id
     */
    private Long parentId;

}
