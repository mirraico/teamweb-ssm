/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 服务执行模板类
 *
 * @author feixuan.fx
 * @version $Id: ServiceTemplate.java, v 0.1 2018-05-02 20:01 feixuan.fx Exp $
 */
public class ServiceTemplate {

    /**
     * 事务模板
     */
    @Autowired
    private TransactionTemplate transactionTemplate;

    /**
     * 执行服务
     *
     * @param callback 服务回调
     * @param result 执行结果
     * @param isTransaction 是否需要开启事务
     */
    public void execute(final ServiceCallback callback, ServiceResult result, boolean isTransaction) {

        // 参数检查
        if (callback == null || result == null) {
            if (result != null) {
                result.buildFail(ServiceResultCodeEnum.INVALID_PARAM);
            }
            return;
        }

        try {

            // 执行服务前检查
            if (!callback.check()) {
                return;
            }
            // 执行服务
            if (isTransaction) {
                transactionTemplate.execute(new TransactionCallback<Object>() {
                    @Override
                    public Object doInTransaction(TransactionStatus transactionStatus) {
                        callback.service();
                        return null;
                    }
                });
            } else {
                callback.service();
            }
            // 执行服务成功
            result.buildSuccess();

        } catch (ServiceException e) {
            result.buildFail(e.getResultCode());
        } catch (DataAccessException e) {
            e.printStackTrace();
            result.buildFail(ServiceResultCodeEnum.DATA_EXCEPTION);
        } catch (Exception e) {
            e.printStackTrace();
            result.buildFail(ServiceResultCodeEnum.UNKNOWN_EXCEPTION);
        }

    }

}