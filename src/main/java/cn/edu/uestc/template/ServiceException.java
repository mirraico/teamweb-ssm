/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.template;

/**
 * 服务执行异常类
 *
 * @author feixuan.fx
 * @version $Id: ServiceException.java, v 0.1 2018-05-02 20:59 feixuan.fx Exp $
 */
public class ServiceException extends RuntimeException {

    /**
     * 结果码
     */
    private ServiceResultCodeEnum resultCode;

    /**
     * 构造方法
     *
     * @param resultCode 结果码
     */
    public ServiceException(ServiceResultCodeEnum resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 构造方法
     *
     * @param resultCode 结果码
     * @param description 描述
     */
    public ServiceException(ServiceResultCodeEnum resultCode, String description) {
        this.resultCode = resultCode;
        this.resultCode.setDescription(description);
    }

    /**
     * Getter method for property <b>resultCode</b>.
     *
     * @return property value of resultCode
     */
    public ServiceResultCodeEnum getResultCode() {
        return resultCode;
    }

    /**
     * Setter method for property <b>resultCode</b>.
     *
     * @param resultCode value be assigned to resultCode
     */
    public void setResultCode(ServiceResultCodeEnum resultCode) {
        this.resultCode = resultCode;
    }
}