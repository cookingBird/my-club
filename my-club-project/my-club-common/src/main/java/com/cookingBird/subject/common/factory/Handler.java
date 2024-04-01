package com.cookingBird.subject.common.factory;

import com.cookingBird.subject.common.enums.Enum;

public interface Handler<T extends Object> {

    Enum getType();

    void process(T object);
}
