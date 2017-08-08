package com.spawpaw.ssm.exception;

/**
 * 用户未登录时抛出的异常
 *
 * @author BenBenShang spawpaw@hotmail.com on 17-7-2.
 */
public class UserNotLoginException extends ServiceException {
    public UserNotLoginException() {
    }

    public UserNotLoginException(String message) {
        super(message);
    }

    public UserNotLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotLoginException(Throwable cause) {
        super(cause);
    }

    public UserNotLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
