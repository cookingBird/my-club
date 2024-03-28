package com.cookingBird.subject.common.enums;

import lombok.Getter;

@Getter
public enum CategoryEnum {
    PRIMARY(0, "一级分类"),
    SECOND(1, "二级分类"),
    THIRD(2, "三级分类"),
    ;

    private int code;
    private String desc;

    CategoryEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static CategoryEnum getByCode(int codeVal) {
        for (CategoryEnum resultCodeEnum : CategoryEnum.values()) {
            if (resultCodeEnum.code == codeVal) {
                return resultCodeEnum;
            }
        }
        return null;
    }
}