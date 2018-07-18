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
        registerEx(10001, "(无权访问本接口)", PermissionDeniedException.class.toString());


        //java 异常体系中的异常
        registerEx(50001, "不允许为空的变量传入了空值,可能是表单的某些必填项为空", NullPointerException.class.toString());
        registerEx(50002, "类型转换错误", ClassCastException.class.toString());
        registerEx(50003, "算数错误,像0被用作分母这种", ArithmeticException.class.toString());
        registerEx(50004, "数组越界", ArrayIndexOutOfBoundsException.class.toString());

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
        registerEx(50302, "|-RecoverableDataAccessException                            ", org.springframework.dao.RecoverableDataAccessException.class.toString());
        registerEx(50303, "|-        TransientDataAccessException                ", org.springframework.dao.TransientDataAccessException.class.toString());
        registerEx(50304, "| |-      QueryTimeoutException                       ", org.springframework.dao.QueryTimeoutException.class.toString());
        registerEx(50305, "| |-      TransientDataAccessResourceException        ", org.springframework.dao.TransientDataAccessResourceException.class.toString());
        registerEx(50306, "| |-      ConcurrencyFailureException                 ", org.springframework.dao.ConcurrencyFailureException.class.toString());
        registerEx(50307, "|   |-    OptimisticLockingFailureException           ", org.springframework.dao.OptimisticLockingFailureException.class.toString());
        registerEx(50308, "|   |-    PessimisticLockingFailureException          ", org.springframework.dao.PessimisticLockingFailureException.class.toString());
        registerEx(50309, "|     |-  CannotAcquireLockException                  ", org.springframework.dao.CannotAcquireLockException.class.toString());
        registerEx(50300, "|     |-  DeadlockLoserDataAccessException            ", org.springframework.dao.DeadlockLoserDataAccessException.class.toString());
        registerEx(50311, "|     |-  CannotSerializeTransactionException         ", org.springframework.dao.CannotSerializeTransactionException.class.toString());
        registerEx(50312, "|-        NonTransientDataAccessException             ", org.springframework.dao.NonTransientDataAccessException.class.toString());
        registerEx(50313, "| |-      DataRetrievalFailureException               ", org.springframework.dao.DataRetrievalFailureException.class.toString());
        registerEx(50314, "| | |-    IncorrectResultSizeDataAccessException      ", org.springframework.dao.IncorrectResultSizeDataAccessException.class.toString());
        registerEx(50315, "| |   |-  EmptyResultDataAccessException              ", org.springframework.dao.EmptyResultDataAccessException.class.toString());
        registerEx(50316, "| |-      DataIntegrityViolationException             ", org.springframework.dao.DataIntegrityViolationException.class.toString());
        registerEx(50317, "| | |-    DuplicateKeyException                       ", org.springframework.dao.DuplicateKeyException.class.toString());
        registerEx(50318, "| |-      UncategorizedDataAccessException            ", org.springframework.dao.UncategorizedDataAccessException.class.toString());
        registerEx(50319, "| |-      InvalidDataAccessResourceUsageException     ", org.springframework.dao.InvalidDataAccessResourceUsageException.class.toString());
        registerEx(50320, "| | |-    TypeMismatchDataAccessException             ", org.springframework.dao.TypeMismatchDataAccessException.class.toString());
        registerEx(50321, "| | |-    IncorrectUpdateSemanticsDataAccessException ", org.springframework.dao.IncorrectUpdateSemanticsDataAccessException.class.toString());
        registerEx(50322, "| |-      InvalidDataAccessApiUsageException          ", org.springframework.dao.InvalidDataAccessApiUsageException.class.toString());
        registerEx(50323, "| |-      CleanupFailureDataAccessException           ", org.springframework.dao.CleanupFailureDataAccessException.class.toString());
        registerEx(50324, "| |-      PermissionDeniedDataAccessException         ", org.springframework.dao.PermissionDeniedDataAccessException.class.toString());
        registerEx(50325, "| |-      NonTransientDataAccessResourceException     ", org.springframework.dao.NonTransientDataAccessResourceException.class.toString());
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
