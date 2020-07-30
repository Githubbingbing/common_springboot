package com.example.springboot.base;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    protected int code;
    protected String message;
    protected T data;

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(int code) {
        this.code = code;
    }

    public Result(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result() {
    }


    public static <E> Result<E> success() {
        return new Result(HttpStatus.OK.value());
    }

    public static <E> Result<E> success(String message) {
        return new Result(HttpStatus.OK.value(), message);
    }

    public static <E> Result<E> success(E data) {
        return new Result(HttpStatus.OK.value(), data);
    }

    public static <E> Result<E> success(String message, E data) {
        return new Result(HttpStatus.OK.value(), message, data);
    }

    public static <E> Result<E> error(String message) {

        return new Result(HttpStatus.BAD_REQUEST.value(), message);
    }

    public static <E> Result<E> error(E data) {
        return new Result(HttpStatus.BAD_REQUEST.value(), data);
    }

    public static <E> Result<E> error(String message, E data) {
        return new Result(HttpStatus.BAD_REQUEST.value(), message, data);
    }

    public static <E> Result<E> error(HttpStatus status, String message, E data) {
        return new Result(status.value(), message, data);
    }

    public static <E> Result<E> error(HttpStatus status, String message) {
        return new Result(status.value(), message);
    }

}
