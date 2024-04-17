package com.cookingBird.subject.common.exception;

public class ProcessException extends Exception implements BaseException {
    @Override
    public Integer getCode() {
        return 503;
    }

    @Override
    public String getDesc() {
        return "方法过程执行错误";
    }
}
