package com.cookingBird.subject.common.factory;

import com.cookingBird.subject.common.enums.Enum;

public interface Factory {
    Handler getHandler(int code);
}
