package com.spawpaw.ssm.exception;

/**
 * 因密码错误而登录失败时抛出的异常
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/6/26
 */
public class WrongPasswordException extends ServiceException {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPasswordException(Throwable cause) {
        super(cause);
    }

    public WrongPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
