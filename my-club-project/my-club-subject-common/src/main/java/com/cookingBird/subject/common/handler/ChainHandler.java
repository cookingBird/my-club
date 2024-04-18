package com.cookingBird.subject.common.handler;

import com.cookingBird.subject.common.enums.Enum;
import com.cookingBird.subject.common.processor.ChainProcessor;

public interface ChainHandler<C, Arg, R> extends ChainProcessor<Arg, R> {
    Enum<C> getType();
}
