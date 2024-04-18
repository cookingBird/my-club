package com.cookingBird.subject.common.handler;

import com.cookingBird.subject.common.enums.Enum;
import com.cookingBird.subject.common.processor.Processor;

public interface Handler<C, T, R> extends Processor<T, R> {

    Enum<C> getType();

}
