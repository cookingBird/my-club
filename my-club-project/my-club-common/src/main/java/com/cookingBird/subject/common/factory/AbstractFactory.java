package com.cookingBird.subject.common.factory;

import com.cookingBird.subject.common.enums.Enum;
import org.springframework.beans.factory.InitializingBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract public class AbstractFactory implements InitializingBean, Factory {
    private static Map<Enum, Handler> handlerMap = new HashMap<>();

    protected abstract List<Handler> getInjectHandlers();

    public Handler getHandler(Enum en) {
        return handlerMap.get(en);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        for (Handler handler : getInjectHandlers()) {
            handlerMap.put(handler.getType(), handler);
        }
    }
}
