package com.spawpaw.ssm.exception;

/**
 * 当session超时或用户未登录时抛出该异常
 *
 * @author BenBenShang spawpaw@hotmail.com on 2016/12/25.
 */
public class SessionTimeoutException extends ServiceException {
    public SessionTimeoutException() {
    }

    public SessionTimeoutException(String message) {
        super(message);
    }

    public SessionTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }

    public SessionTimeoutException(Throwable cause) {
        super(cause);
    }

    public SessionTimeoutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
