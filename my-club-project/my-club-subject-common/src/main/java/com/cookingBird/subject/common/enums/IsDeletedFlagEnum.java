package com.cookingBird.subject.common.enums;

import lombok.Getter;

@Getter
public enum IsDeletedFlagEnum implements Enum<Integer> {

    DELETE(1, "已删除"),
    UN_DELETE(0, "未删除"),
    ;

    private final Integer code;
    private final String desc;

    IsDeletedFlagEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static IsDeletedFlagEnum getByCode(Integer codeVal) {
        for (IsDeletedFlagEnum resultCodeEnum : IsDeletedFlagEnum.values()) {
            if (resultCodeEnum.code.equals(codeVal)) {
                return resultCodeEnum;
            }
        }
        return null;
    }
}
