package com.spawpaw.ssm.util;

import javax.servlet.http.HttpSession;

/**
 * 权限验证器
 * 定义相关权限的枚举,然后在checkPermission中检查session是否满足相关权限
 * <p>
 * 可以直接在这里抛出异常,然后ControllerAdvice会捕获该异常并返回该异常对应的代码和描述
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
public enum Auth {

    ROOT(new CheckAuthCallback() {
        @Override
        public boolean check(HttpSession session) {
            return isRootUser(session);
        }
    }),
    //用户已经登录
    LOGGED_IN(new CheckAuthCallback() {
        @Override
        public boolean check(HttpSession session) {
            return session.getAttribute("user") != null;
        }
    }),

    //正式用户,不包括那些正在审核或正在审核期的用户
    FORMAL_USER(new CheckAuthCallback() {
        @Override
        public boolean check(HttpSession session) {
            return false;
        }
    }),

    //用户有进入X模块的权限
    CAN_ACCESS_X_MODULE(new CheckAuthCallback() {
        @Override
        public boolean check(HttpSession session) {
            return false;
        }
    }),


    //接口不允许任何人使用(如果设置了这个权限,那不论有没有设置其他权限,都将不可用)
    NOBODY(new CheckAuthCallback() {
        @Override
        public boolean check(HttpSession session) {
            return false;
        }
    });


    /**
     * 检查当前session中的用户是否有本枚举值所要求的权限
     * 如果用户为根用户,则无论那种权限,都返回true
     *
     * @return 满足则返回true, 否则返回false
     */
    public boolean checkPermission(HttpSession session) {
        return isRootUser(session) || this.checkAuthCallback.check(session);
    }

    /**
     * 检查当前session对应的用户是否为根用户(具备所有权限)
     * 如果返回true,则将忽略所有其他权限验证
     */
    private static boolean isRootUser(HttpSession session) {
        return false;
    }

    private CheckAuthCallback checkAuthCallback;

    Auth(CheckAuthCallback checkAuthCallback) {
        this.checkAuthCallback = checkAuthCallback;
    }

    interface CheckAuthCallback {
        boolean check(HttpSession session);
    }

}
