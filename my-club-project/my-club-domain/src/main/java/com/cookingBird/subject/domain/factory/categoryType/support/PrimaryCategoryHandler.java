package com.cookingBird.subject.domain.factory.categoryType.support;

import com.cookingBird.subject.common.enums.CategoryEnum;
import com.cookingBird.subject.domain.factory.categoryType.CategoryTypeHandler;

public class PrimaryCategoryHandler implements CategoryTypeHandler {
    @Override
    public void process(Object object) {

    }

    @Override
    public CategoryEnum getCategoryType() {
        return CategoryEnum.PRIMARY;
    }
}
