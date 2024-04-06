package com.cookingBird.subject.common.exception;

public class ParamsTypeException extends Exception implements BaseException {
    @Override
    public Integer getCode() {
        return 501;
    }

    @Override
    public String getDesc() {
        return "参数类型错误";
    }
}
