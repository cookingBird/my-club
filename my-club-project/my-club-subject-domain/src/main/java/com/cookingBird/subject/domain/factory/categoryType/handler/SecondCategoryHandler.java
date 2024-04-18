package com.cookingBird.subject.domain.factory.categoryType.handler;

import com.cookingBird.subject.common.enums.CategoryEnum;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.domain.factory.categoryType.*;
import com.cookingBird.subject.domain.service.SubjectCategoryDomainService;
import com.google.common.base.Preconditions;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

@Component
public class SecondCategoryHandler extends CategoryTypeHandler {
    @Resource
    SubjectCategoryDomainService subjectCategoryDomainService;

    @Override
    public CategoryEnum getType() {
        return CategoryEnum.SECOND;
    }

    @Override
    public Void process(SubjectCategoryBO object) {
        checkDefault(object);
        Preconditions.checkNotNull(object.getParentId(), "分类父级id不能为空");
        subjectCategoryDomainService.add(object);
        return null;
    }
}
