package com.cookingBird.subject.common.exception;

public class UnknownException extends Exception implements BaseException {
    @Override
    public Integer getCode() {
        return 505;
    }

    @Override
    public String getDesc() {
        return "未知错误";
    }
}
