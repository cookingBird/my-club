package com.cookingBird.subject.infra.basic.entity;

import com.cookingBird.subject.common.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

@Data
@ApiModel(description = "题目信息实体类")
public class SubjectInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -76256271717248363L;
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "题目名称")
    private String subjectName;

    @ApiModelProperty(value = "题目难度")
    private Integer subjectDifficult;

    @ApiModelProperty(value = "出题人名")
    private String settleName;

    @ApiModelProperty(value = "题目类型 1单选 2多选 3判断 4简答")
    private Integer subjectType;

    @ApiModelProperty(value = "题目分数")
    private Integer subjectScore;

    @ApiModelProperty(value = "题目解析")
    private String subjectParse;

}

