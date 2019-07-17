package com.example.demo.utils;

import lombok.Data;

import java.util.List;

@Data
public class ResponseResult<T> {
    private int code;
    private String msg;
    private T data;
    private List<T> list;

    public ResponseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(int code, String msg, List<T> list) {
        this.code = code;
        this.msg = msg;
        this.list = list;
    }
}
