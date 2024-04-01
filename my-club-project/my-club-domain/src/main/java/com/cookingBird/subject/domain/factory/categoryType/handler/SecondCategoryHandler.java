package com.cookingBird.subject.domain.factory.categoryType.handler;

import com.cookingBird.subject.common.enums.CategoryEnum;
import com.cookingBird.subject.domain.entity.SubjectCategoryBO;
import com.cookingBird.subject.common.factory.Handler;
import com.cookingBird.subject.domain.factory.categoryType.*;
import com.cookingBird.subject.domain.service.SubjectCategoryDomainService;
import com.google.common.base.Preconditions;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

@Component
public class SecondCategoryHandler implements CategoryTypeHandler {
    @Resource
    SubjectCategoryDomainService subjectCategoryDomainService;

    @Override
    public CategoryEnum getType() {
        return CategoryEnum.SECOND;
    }

    @Override
    public void process(SubjectCategoryBO object) {
        SubjectCategoryBO subjectCategoryBO = object;
        checkDefault(subjectCategoryBO);
        Preconditions.checkNotNull(subjectCategoryBO.getParentId(), "分类父级id不能为空");
        subjectCategoryDomainService.add(subjectCategoryBO);
    }
}
