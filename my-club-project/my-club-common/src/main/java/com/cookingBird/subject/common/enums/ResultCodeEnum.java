package com.cookingBird.subject.common.enums;

import lombok.Getter;

@Getter
public enum ResultCodeEnum implements Enum {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    ;


    int code;
    String desc;

    ResultCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ResultCodeEnum getByCode(int codeVal) {
        for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()) {
            if (resultCodeEnum.code == codeVal) {
                return resultCodeEnum;
            }
        }
        return null;
    }
}
