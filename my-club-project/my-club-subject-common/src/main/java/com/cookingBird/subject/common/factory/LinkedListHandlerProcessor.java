package com.cookingBird.subject.common.factory;


import com.cookingBird.subject.common.handler.ChainHandler;

import java.util.*;

public class LinkedListHandlerProcessor<Code, Arg, R> extends LinkedList<ChainHandler<Code, Arg, R>> {

    public R process(Arg payload) {
        Object result = null;
        for (ChainHandler<Code, Arg, R> codeArgRChainHandler : this) {
            result = codeArgRChainHandler.process(payload, (R) result);
        }
        return (R) result;
    }
}
