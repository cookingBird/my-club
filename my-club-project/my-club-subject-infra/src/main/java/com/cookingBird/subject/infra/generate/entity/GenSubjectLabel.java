package com.cookingBird.subject.infra.generate.entity;

import java.util.Date;
import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * 题目标签表(GenSubjectLabel)实体类
 *
 * @author makejava
 * @since 2024-04-09 23:25:46
 */
public class GenSubjectLabel implements Serializable {
    private static final long serialVersionUID = 944616698926753866L;
    @ApiModelProperty(value = "主键")
    private Long id;
    @ApiModelProperty(value = "标签分类")
    private String labelName;
    @ApiModelProperty(value = "排序")
    private Integer sortNum;
    private String categoryId;
    @ApiModelProperty(value = "创建人")
    private String createdBy;
    @ApiModelProperty(value = "创建时间")
    private Date createdTime;
    @ApiModelProperty(value = "更新人")
    private String updateBy;
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
    private Integer isDeleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}
