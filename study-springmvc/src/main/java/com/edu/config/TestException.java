package com.edu.config;

/**
 * @program: study-springmvc
 * @description:
 * @author: lihangyu
 * @create: 2020-11-21 20:23
 */
public class TestException extends Exception{
    public TestException() {
    }

    public TestException(String message) {
        super(message);
    }

    public TestException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestException(Throwable cause) {
        super(cause);
    }

    public TestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
