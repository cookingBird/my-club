package com.cookingBird.subject.common.factory;

import com.cookingBird.subject.common.enums.Enum;
import com.cookingBird.subject.common.handler.Handler;
import org.springframework.beans.factory.InitializingBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractFactory<Code, Arg, R> implements InitializingBean, Factory<Code> {

    @Override
    public abstract Object getHandler(Code code);

    protected final Map<Enum<Code>, Handler<Code, Arg, R>> handlerMap = new HashMap<>();

    protected abstract List<Handler<Code, Arg, R>> getInjectHandlers();

    @Override
    public void afterPropertiesSet() throws Exception {
        for (Handler<Code, Arg, R> handler : getInjectHandlers()) {
            handlerMap.put(handler.getType(), handler);
        }
    }
}
