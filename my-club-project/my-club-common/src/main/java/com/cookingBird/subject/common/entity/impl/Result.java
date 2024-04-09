package com.cookingBird.subject.common.entity.impl;

import com.cookingBird.subject.common.enums.ResultCodeEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    String message;

    int code;

    boolean success;

    T data;

    public static Result<Void> ok() {
        Result<Void> result = new Result<Void>();
        result.setSuccess(true);
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SUCCESS.getDesc());
        return result;
    }

    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<T>();
        result.setSuccess(true);
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SUCCESS.getDesc());
        result.setData(data);
        return result;
    }

    public static Result<Void> fail() {
        Result<Void> result = new Result<Void>();
        result.setSuccess(false);
        result.setCode(ResultCodeEnum.FAIL.getCode());
        result.setMessage(ResultCodeEnum.FAIL.getDesc());
        return result;
    }

    public static <T> Result<T> fail(T data) {
        Result<T> result = new Result<T>();
        result.setSuccess(false);
        result.setCode(ResultCodeEnum.FAIL.getCode());
        result.setMessage(ResultCodeEnum.FAIL.getDesc());
        result.setData(data);
        return result;
    }

    public static class DELETE {
        public static Result<Boolean> fail() {
            return Result.fail(false);
        }

        public static Result<Boolean> ok() {
            return Result.ok(true);
        }
    }
}
