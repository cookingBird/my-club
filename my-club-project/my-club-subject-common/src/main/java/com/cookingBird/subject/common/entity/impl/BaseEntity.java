package com.cookingBird.subject.common.entity.impl;

import com.cookingBird.subject.common.entity.info.ICreateBase;
import com.cookingBird.subject.common.entity.info.ILogicDeleteBase;
import com.cookingBird.subject.common.entity.info.IUpdateBase;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class BaseEntity extends LogicDeleteEntity implements Serializable, ICreateBase, IUpdateBase, ILogicDeleteBase {

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改人")
    private String updateBy;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;
}
