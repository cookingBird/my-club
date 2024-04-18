package com.cookingBird.subject.common.enums;

import lombok.Getter;

@Getter
public enum ResultCodeEnum implements Enum<Integer> {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    ;


    Integer code;
    String desc;

    ResultCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ResultCodeEnum getByCode(Integer codeVal) {
        for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()) {
            if (resultCodeEnum.code.equals(codeVal)) {
                return resultCodeEnum;
            }
        }
        return null;
    }
}
