package com.spawpaw.ssmtemplate.common.exception;

/**
 * Created by wengshenshun on 2016/12/25.
 *
 *
 */
public class SessionTimeoutException extends RuntimeException {
    public SessionTimeoutException (String message){
        super(message);
    }
}
