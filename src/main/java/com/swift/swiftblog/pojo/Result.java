package com.swift.swiftblog.pojo;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;//编码：1为成功 0为失败
    private String msg;//错误信息
    private T data;//数据信息

    public static  Result success() {
        Result result = new Result();
        result.code = 1;
        return result;
    }

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<T>();
        result.data = object;
        result.code = 1;
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result result = new Result();
        result.msg = msg;
        result.code = 0;
        return result;
    }
}
