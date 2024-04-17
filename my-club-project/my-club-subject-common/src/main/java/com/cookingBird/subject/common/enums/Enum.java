package com.cookingBird.subject.common.enums;

public interface Enum {

    int getCode();

    String getDesc();

    static Object getByCode(int codeVal) {
        return null;
    }
}
