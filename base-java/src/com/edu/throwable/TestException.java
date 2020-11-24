package com.edu.throwable;

/**
 * @program: base-java
 * @description:
 * @author: lihangyu
 * @create: 2020-11-24 09:33
 */
public class TestException extends Exception{
    public TestException() {
        super();
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

    protected TestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
