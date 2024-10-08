package com.cookingBird.subject.domain.factory.categoryType.handler;

import com.cookingBird.subject.common.enums.CategoryEnum;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.domain.factory.categoryType.*;
import com.cookingBird.subject.domain.service.SubjectCategoryDomainService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class PrimaryCategoryHandler extends CategoryTypeHandler {
    @Resource
    SubjectCategoryDomainService subjectCategoryDomainService;

    @Override
    public CategoryEnum getType() {
        return CategoryEnum.PRIMARY;
    }

    @Override
    public Void process(SubjectCategoryBO object) {
        checkDefault(object);
        subjectCategoryDomainService.add(object);
        return null;
    }

}
