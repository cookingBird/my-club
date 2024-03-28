package com.cookingBird.subject.domain.factory.categoryType;

import com.cookingBird.subject.common.enums.CategoryEnum;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CategoryTypeHandlerFactory implements InitializingBean {

    @Resource
    private List<CategoryTypeHandler> categoryTypeHandlers = new LinkedList<>();

    private Map<CategoryEnum, CategoryTypeHandler> categoryTypeHandlerMap = new HashMap<>();

    CategoryTypeHandler getHandler(int categoryType) {
        CategoryEnum categoryEnum = CategoryEnum.getByCode(categoryType);
        return categoryTypeHandlerMap.get(categoryEnum);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        for (CategoryTypeHandler typeHandler : categoryTypeHandlers) {
            categoryTypeHandlerMap.put(typeHandler.getCategoryType(), typeHandler);
        }
    }
}
