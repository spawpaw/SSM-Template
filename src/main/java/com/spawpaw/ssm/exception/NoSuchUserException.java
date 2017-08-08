package com.spawpaw.ssm.exception;

/**
 * 登录失败，用户不存在 时所抛出的异常
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/6/26
 */
public class NoSuchUserException extends ServiceException {
    public NoSuchUserException() {
    }

    public NoSuchUserException(String message) {
        super(message);
    }

    public NoSuchUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchUserException(Throwable cause) {
        super(cause);
    }

    public NoSuchUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
