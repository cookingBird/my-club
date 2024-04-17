package com.cookingBird.subject.domain.service;

import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.infra.basic.entity.SubjectCategory;

import java.util.List;

public interface SubjectCategoryDomainService {

    /**
     * 新增分类
     */
    void add(SubjectCategoryBO subjectCategoryBO);

    /**
     * 查询岗位大类
     */
    List<SubjectCategoryBO> queryCategory(SubjectCategory subjectCategory);

    /**
     * 更新分类
     */
    Boolean update(SubjectCategoryBO subjectCategoryBO);

    /**
     * 删除分类
     */
    Boolean delete(SubjectCategoryBO subjectCategoryBO);

    /**
     * 查询分类及标签
     */
    List<SubjectCategoryBO> queryCategoryAndLabel(SubjectCategoryBO subjectCategoryBO);

}
