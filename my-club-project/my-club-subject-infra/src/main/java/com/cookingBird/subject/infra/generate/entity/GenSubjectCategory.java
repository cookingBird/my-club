package com.cookingBird.subject.infra.generate.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModelProperty;

/**
 * 题目分类(GenSubjectCategory)实体类
 *
 * @author makejava
 * @since 2024-04-18 00:36:47
 */
public class GenSubjectCategory implements Serializable {
    private static final long serialVersionUID = 703733728629283015L;
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
        @ApiModelProperty(value = "创建人")
        private String createdBy;
        @ApiModelProperty(value = "创建时间")
        private Long createdTime;
        @ApiModelProperty(value = "更新人")
        private String updateBy;
        @ApiModelProperty(value = "更新时间")
        private Long updateTime;
        @ApiModelProperty(value = "是否删除 0: 未删除 1: 已删除")
        private Integer isDeleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
