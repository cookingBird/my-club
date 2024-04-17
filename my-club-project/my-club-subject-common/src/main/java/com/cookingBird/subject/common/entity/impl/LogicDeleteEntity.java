package com.cookingBird.subject.common.entity.impl;

import com.cookingBird.subject.common.entity.info.ILogicDeleteBase;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class LogicDeleteEntity implements ILogicDeleteBase {

    @ApiModelProperty(value = "是否删除")
    private Integer isDeleted;
}
