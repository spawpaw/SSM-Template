package com.spawpaw.ssm.exception;

import com.spawpaw.ssm.common.controller.CommonResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/9/5
 */
@Service
public class ExceptionInfoService {
    private Map<String, CommonResponse> errorMap;

    ExceptionInfoService() {
        registerEx(10001, "喵主子拒绝了你的腐摸并向你翻了个白眼(无权访问本接口)", PermissionDeniedException.class.toString());




        //java 异常体系中的异常
        registerEx(50001, "说好的给喵主子的小鱼饼干呢?(不允许为空的变量传入了空值)", NullPointerException.class.toString());
        registerEx(50002, "猫->狗 的转换发生了错误,喵星人永不为奴!(类型转换错误)", ClassCastException.class.toString());
        registerEx(50003, "0/0,(算数错误,像0被用作分母这种)", ArithmeticException.class.toString());
        registerEx(50004, "喵主子正在数它有几根毛...1根..2根......喵主子脑袋不够用了(/ □ \\)...(数组越界)", ArrayIndexOutOfBoundsException.class.toString());

        /* spring异常体系中的异常
         * DataAccessException
         * |-RecoverableDataAccessException
         * |-TransientDataAccessException
         * | |-QueryTimeoutException
         * | |-TransientDataAccessResourceException
         * | |-ConcurrencyFailureException
         * |   |-OptimisticLockingFailureException
         * |   |-PessimisticLockingFailureException
         * |     |-CannotAcquireLockException
         * |     |-DeadlockLoserDataAccessException
         * |     |-CannotSerializeTransactionException
         * |-NonTransientDataAccessException
         * | |-DataRetrievalFailureException
         * | | |-IncorrectResultSizeDataAccessException
         * | |   |-EmptyResultDataAccessException
         * | |-DataIntegrityViolationException
         * | | |-DuplicateKeyException
         * | |-UncategorizedDataAccessException
         * | |-InvalidDataAccessResourceUsageException
         * | | |-TypeMismatchDataAccessException
         * | | |-IncorrectUpdateSemanticsDataAccessException
         * | |-InvalidDataAccessApiUsageException
         * | |-CleanupFailureDataAccessException
         * | |-PermissionDeniedDataAccessException
         * | |-NonTransientDataAccessResourceException
         */
        registerEx(50301, "|spring dao层异常的根异常,数据访问异常", org.springframework.dao.DataAccessException.class.toString());
        registerEx(50302, "|-虽然看门的汪星人不让你进家门,但如果你换个姿势再试一次可能还是有机会的(RecoverableDataAccess)", org.springframework.dao.RecoverableDataAccessException.class.toString());
        registerEx(50303, "|-                       TransientDataAccess               ,", org.springframework.dao.TransientDataAccessException.class.toString());
        registerEx(50304, "| |-                     QueryTimeout                      ,", org.springframework.dao.QueryTimeoutException.class.toString());
        registerEx(50305, "| |-                     TransientDataAccessResource       ,", org.springframework.dao.TransientDataAccessResourceException.class.toString());
        registerEx(50306, "| |-                     ConcurrencyFailure                ,", org.springframework.dao.ConcurrencyFailureException.class.toString());
        registerEx(50307, "|   |-                   OptimisticLockingFailure          ,", org.springframework.dao.OptimisticLockingFailureException.class.toString());
        registerEx(50308, "|   |-                   PessimisticLockingFailure         ,", org.springframework.dao.PessimisticLockingFailureException.class.toString());
        registerEx(50309, "|     |-                 CannotAcquireLock                 ,", org.springframework.dao.CannotAcquireLockException.class.toString());
        registerEx(50300, "|     |-                 DeadlockLoserDataAccess           ,", org.springframework.dao.DeadlockLoserDataAccessException.class.toString());
        registerEx(50311, "|     |-                 CannotSerializeTransaction        ,", org.springframework.dao.CannotSerializeTransactionException.class.toString());
        registerEx(50312, "|-                       NonTransientDataAccess            ,", org.springframework.dao.NonTransientDataAccessException.class.toString());
        registerEx(50313, "| |-                     DataRetrievalFailure              ,", org.springframework.dao.DataRetrievalFailureException.class.toString());
        registerEx(50314, "| | |-                   IncorrectResultSizeDataAccess     ,", org.springframework.dao.IncorrectResultSizeDataAccessException.class.toString());
        registerEx(50315, "| |   |-                 EmptyResultDataAccess             ,", org.springframework.dao.EmptyResultDataAccessException.class.toString());
        registerEx(50316, "| |-                     DataIntegrityViolation            ,", org.springframework.dao.DataIntegrityViolationException.class.toString());
        registerEx(50317, "| | |- (主键重复)        DuplicateKey                      ,", org.springframework.dao.DuplicateKeyException.class.toString());
        registerEx(50318, "| |-                     UncategorizedDataAccess           ,", org.springframework.dao.UncategorizedDataAccessException.class.toString());
        registerEx(50319, "| |-                     InvalidDataAccessResourceUsage    ,", org.springframework.dao.InvalidDataAccessResourceUsageException.class.toString());
        registerEx(50320, "| | |-                   TypeMismatchDataAccess            ,", org.springframework.dao.TypeMismatchDataAccessException.class.toString());
        registerEx(50321, "| | |-                   IncorrectUpdateSemanticsDataAccess,", org.springframework.dao.IncorrectUpdateSemanticsDataAccessException.class.toString());
        registerEx(50322, "| |-                     InvalidDataAccessApiUsage         ,", org.springframework.dao.InvalidDataAccessApiUsageException.class.toString());
        registerEx(50323, "| |-                     CleanupFailureDataAccess          ,", org.springframework.dao.CleanupFailureDataAccessException.class.toString());
        registerEx(50324, "| |-                     PermissionDeniedDataAccess        ,", org.springframework.dao.PermissionDeniedDataAccessException.class.toString());
        registerEx(50325, "| |-                     NonTransientDataAccessResource    ,", org.springframework.dao.NonTransientDataAccessResourceException.class.toString());
    }


    private void registerEx(int code, String msg, String e) {
        if (errorMap == null) errorMap = new HashMap<>();
        errorMap.put(e, new CommonResponse(code, msg));
    }

    public <T> CommonResponse getCommonResponse(T e) {
        if (errorMap.containsKey(e.getClass().toString()))
            return errorMap.get(e.getClass().toString());

        ((Exception) e).printStackTrace();
        return new CommonResponse(-1, "服务器:鬼知道发生了什么");
    }
}
