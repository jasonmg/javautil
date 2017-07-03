package com.jason.common.exception;

public interface ExceptionHandler<T> {
    void handle(T key, Exception e);
}

