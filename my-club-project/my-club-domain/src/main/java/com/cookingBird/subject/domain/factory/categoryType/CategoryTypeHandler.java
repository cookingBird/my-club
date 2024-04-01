package com.cookingBird.subject.domain.factory.categoryType;

import com.cookingBird.subject.common.enums.Enum;
import com.cookingBird.subject.domain.entity.SubjectCategoryBO;
import com.cookingBird.subject.common.factory.Handler;
import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

public interface CategoryTypeHandler extends Handler<SubjectCategoryBO> {
    default void checkDefault(SubjectCategoryBO subjectCategoryBO) {
        Preconditions.checkArgument(!StringUtils.isBlank(subjectCategoryBO.getCategoryName()), "分类名称不能为空");
    }

    @Override
    Enum getType();

    @Override
    void process(SubjectCategoryBO object);
}
