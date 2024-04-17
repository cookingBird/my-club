package com.cookingBird.subject.domain.factory.categoryType;

import com.cookingBird.subject.common.enums.Enum;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import com.cookingBird.subject.common.factory.Handler;
import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;

abstract public class CategoryTypeHandler implements Handler<SubjectCategoryBO> {
    public void checkDefault(SubjectCategoryBO subjectCategoryBO) {
        Preconditions.checkArgument(!StringUtils.isBlank(subjectCategoryBO.getCategoryName()), "分类名称不能为空");
    }

    @Override
    abstract public Enum getType();

    @Override
    abstract public void process(SubjectCategoryBO object);
}
