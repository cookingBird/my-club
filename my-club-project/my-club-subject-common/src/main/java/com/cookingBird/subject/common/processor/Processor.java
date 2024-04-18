package com.cookingBird.subject.common.processor;

public interface Processor<T, R> {
    default R process(T payload) {
        return null;
    }
}
