package com.cookingBird.subject.common.exception;

public class FeignException extends Exception implements BaseException {
    @Override
    public Integer getCode() {
        return 504;
    }

    @Override
    public String getDesc() {
        return "FEIGN调用错误";
    }
}
