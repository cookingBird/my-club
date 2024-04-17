package com.cookingBird.subject.domain.factory.categoryType;

import com.cookingBird.subject.common.enums.CategoryEnum;
import com.cookingBird.subject.common.factory.AbstractFactory;
import com.cookingBird.subject.common.factory.Factory;
import com.cookingBird.subject.common.factory.FactoryUnSupportException;
import com.cookingBird.subject.common.factory.Handler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryTypeHandlerFactory extends AbstractFactory implements Factory {

    @Resource
    private List<Handler> handlers = new LinkedList<>();

    @Override
    protected List<Handler> getInjectHandlers() {
        return this.handlers
                .stream()
                .filter(t-> t instanceof CategoryTypeHandler)
                .collect(Collectors.toList());
    }

    public CategoryTypeHandler getHandler(int categoryType) {
        CategoryEnum categoryEnum = CategoryEnum.getByCode(categoryType);
        CategoryTypeHandler categoryTypeHandler = (CategoryTypeHandler) super.handlerMap.get(categoryEnum);
        if (categoryTypeHandler == null) throw new FactoryUnSupportException();
        return categoryTypeHandler;
    }
}
