package com.jason.common.exception;

public class ExceptionHandlerRethrow<T> implements ExceptionHandler<T> {
    @Override
    public void handle(T key, Exception e) {
        throw new RuntimeException(e.getCause());
    }
}
