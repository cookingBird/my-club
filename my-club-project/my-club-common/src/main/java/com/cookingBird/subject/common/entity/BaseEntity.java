package com.cookingBird.subject.common.entity;

import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class BaseEntity implements Serializable {

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;

    @ApiModelProperty(value = "修改人")
    private String updateBy;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "是否删除")
    private Integer isDeleted;
}
