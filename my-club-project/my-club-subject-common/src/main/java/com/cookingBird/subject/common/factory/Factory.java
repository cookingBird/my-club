package com.cookingBird.subject.common.factory;

public interface Factory<T> {
    Object getHandler(T code);
}
