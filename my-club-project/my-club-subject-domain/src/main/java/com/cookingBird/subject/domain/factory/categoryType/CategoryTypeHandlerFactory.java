package com.cookingBird.subject.domain.factory.categoryType;

import com.cookingBird.subject.common.enums.CategoryEnum;
import com.cookingBird.subject.common.factory.*;
import com.cookingBird.subject.common.handler.Handler;
import com.cookingBird.subject.domain.models.SubjectCategoryBO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryTypeHandlerFactory extends AbstractFactory<Integer, SubjectCategoryBO, Void> {

    @Resource
    private List<Handler<Integer, SubjectCategoryBO, Void>> handlers = new LinkedList<>();

    @Override
    protected List<Handler<Integer, SubjectCategoryBO, Void>> getInjectHandlers() {
        return this.handlers
                .stream()
                .filter(t -> t instanceof CategoryTypeHandler)
                .collect(Collectors.toList());
    }

    public Handler<Integer, SubjectCategoryBO, Void> getHandler(Integer categoryType) {
        CategoryEnum categoryEnum = CategoryEnum.getByCode(categoryType);
        Handler<Integer, SubjectCategoryBO, Void> categoryTypeHandler = super.handlerMap.get(categoryEnum);
        if (categoryTypeHandler == null) throw new FactoryUnSupportException();
        return categoryTypeHandler;
    }
}
