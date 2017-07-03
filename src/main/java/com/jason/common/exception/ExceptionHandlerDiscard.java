package com.jason.common.exception;

public class ExceptionHandlerDiscard<T> implements ExceptionHandler<T> {
    public void handle(T key, Exception e) {
        // discard
    }
}
