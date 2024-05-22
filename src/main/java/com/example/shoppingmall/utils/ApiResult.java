package com.example.shoppingmall.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ApiResult<T> {
    boolean success;
    T response;
    ApiError error;

    @AllArgsConstructor
    public static class ApiError{
        String message;
        HttpStatus httpStatus;


    }
}
