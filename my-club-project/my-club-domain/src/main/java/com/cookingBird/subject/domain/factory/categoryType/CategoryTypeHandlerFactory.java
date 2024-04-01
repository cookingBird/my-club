package com.cookingBird.subject.domain.factory.categoryType;

import com.cookingBird.subject.common.enums.CategoryEnum;
import com.cookingBird.subject.common.factory.AbstractFactory;
import com.cookingBird.subject.common.factory.Factory;
import com.cookingBird.subject.common.factory.Handler;
import com.cookingBird.subject.common.util.Converter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Component
public class CategoryTypeHandlerFactory extends AbstractFactory implements Factory {

    @Resource
    private List<CategoryTypeHandler> categoryTypeHandlers = new LinkedList<>();

    @Override
    protected List<Handler> getInjectHandlers() {
        return Converter.A2B(this.categoryTypeHandlers);
    }

    public CategoryTypeHandler getHandler(int categoryType) {
        CategoryEnum categoryEnum = CategoryEnum.getByCode(categoryType);
        return (CategoryTypeHandler) super.getHandler(categoryEnum);
    }
}
