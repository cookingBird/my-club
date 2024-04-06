package com.cookingBird.subject.common.exception;

public class ParamsLeakException extends Exception implements BaseException {
    @Override
    public Integer getCode() {
        return 501;
    }

    @Override
    public String getDesc() {
        return "缺少必要参数";
    }
}
