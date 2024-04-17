package com.cookingBird.subject.infra.generate.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModelProperty;

/**
 * 题目标签表(GenSubjectLabel)实体类
 *
 * @author makejava
 * @since 2024-04-18 00:38:26
 */
public class GenSubjectLabel implements Serializable {
    private static final long serialVersionUID = 467646518757306996L;
        @ApiModelProperty(value = "主键")
        private Long id;
        @ApiModelProperty(value = "标签分类")
        private String labelName;
        @ApiModelProperty(value = "排序")
        private Integer sortNum;
        @ApiModelProperty(value = "分类ID")
        private String subjectCategoryId;
        @ApiModelProperty(value = "创建人")
        private String createdBy;
        @ApiModelProperty(value = "创建时间")
        private Long createdTime;
        @ApiModelProperty(value = "更新人")
        private String updateBy;
        @ApiModelProperty(value = "更新时间")
        private Long updateTime;
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

    public String getSubjectCategoryId() {
        return subjectCategoryId;
    }

    public void setSubjectCategoryId(String subjectCategoryId) {
        this.subjectCategoryId = subjectCategoryId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}
