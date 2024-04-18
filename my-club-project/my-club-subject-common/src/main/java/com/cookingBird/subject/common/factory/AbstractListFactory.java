package com.cookingBird.subject.common.factory;

import com.cookingBird.subject.common.enums.Enum;
import com.cookingBird.subject.common.handler.ChainHandler;
import com.cookingBird.subject.common.handler.Handler;
import org.springframework.beans.factory.InitializingBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

abstract public class AbstractListFactory<Code, Arg, R> implements InitializingBean, Factory<Code> {
    protected final Map<Enum<Code>, LinkedListHandlerProcessor<Code, Arg, R>> handlerMap = new HashMap<>();

    protected abstract List<ChainHandler<Code, Arg, R>> getInjectHandlers();

    @Override
    public void afterPropertiesSet() throws Exception {
        for (ChainHandler<Code, Arg, R> handler : getInjectHandlers()) {
            LinkedListHandlerProcessor<Code, Arg, R> linkedListHandlerProcessor = handlerMap.get(handler.getType());
            if (Objects.isNull(linkedListHandlerProcessor)) {
                linkedListHandlerProcessor = new LinkedListHandlerProcessor<>();
            }
            linkedListHandlerProcessor.add(handler);
            handlerMap.put(handler.getType(), linkedListHandlerProcessor);
        }
    }
}
