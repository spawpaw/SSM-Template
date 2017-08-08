package com.spawpaw.ssm.exception;

/**
 * 权限不足异常，当前用户的权限不足以执行当前操作
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/6/30
 */
public class PermissionDeniedException extends ServiceException {
    public PermissionDeniedException() {
    }

    public PermissionDeniedException(String message) {
        super(message);
    }

    public PermissionDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionDeniedException(Throwable cause) {
        super(cause);
    }

    public PermissionDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
