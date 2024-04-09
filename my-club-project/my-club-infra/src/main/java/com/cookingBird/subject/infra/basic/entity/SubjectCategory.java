package com.cookingBird.subject.infra.basic.entity;

import com.cookingBird.subject.common.entity.impl.BaseEntity;
import com.cookingBird.subject.common.entity.struct.ITreeStruct;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SubjectCategory extends BaseEntity implements Serializable, ITreeStruct<Integer> {
    private static final long serialVersionUID = -51261305032127377L;

    @ApiModelProperty(value = "主键")
    private Long id;
    @ApiModelProperty(value = "分类名称")
    private String categoryName;
    @ApiModelProperty(value = "分类类型")
    private Integer categoryType;
    @ApiModelProperty(value = "图标连接")
    private String imageUrl;
    @ApiModelProperty(value = "父级id")
    private Long parentId;
}
