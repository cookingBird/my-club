package com.cookingBird.subject.common.enums;

import lombok.Getter;

@Getter
public enum CategoryEnum implements Enum<Integer> {
    PRIMARY(0, "一级分类"),
    SECOND(1, "二级分类"),
    THIRD(2, "三级分类"),
    ;

    private final Integer code;
    private final String desc;

    CategoryEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static CategoryEnum getByCode(Integer codeVal) {
        for (CategoryEnum resultCodeEnum : CategoryEnum.values()) {
            if (resultCodeEnum.code.equals(codeVal)) {
                return resultCodeEnum;
            }
        }
        return null;
    }
}