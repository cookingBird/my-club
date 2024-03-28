package com.cookingBird.subject.domain.factory.categoryType;

import com.cookingBird.subject.common.enums.CategoryEnum;

public interface CategoryTypeHandler {
    void process(Object object);

    CategoryEnum getCategoryType();
}
