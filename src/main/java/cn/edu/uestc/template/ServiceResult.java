/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.template;

/**
 * 服务执行结果类
 *
 * @author feixuan.fx
 * @version $Id: ServiceResult.java, v 0.1 2018-05-02 20:15 feixuan.fx Exp $
 */
public class ServiceResult {

    /**
     * 是否成功
     */
    private boolean isSuccess = false;

    /**
     * 结果码
     */
    private ServiceResultCodeEnum resultCode = ServiceResultCodeEnum.UNKNOWN_EXCEPTION;

    /**
     * 构建失败结果
     *
     * @param resultCode 结果代码
     */
    public void buildFail(ServiceResultCodeEnum resultCode) {
        this.isSuccess = false;
        this.resultCode = resultCode;
    }

    /**
     * 构建成功结果
     */
    public void buildSuccess() {
        this.isSuccess = true;
        this.resultCode = ServiceResultCodeEnum.SUCCESS;
    }

    /**
     * 修改描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.resultCode.setDescription(description);
    }

    /**
     * 构建成功结果
     *
     * @param resultCode 结果代码
     */
    public void buildSuccess(ServiceResultCodeEnum resultCode) {
        this.isSuccess = true;
        this.resultCode = resultCode;
    }

    /**
     * Getter method for property <b>isSuccess</b>.
     *
     * @return property value of isSuccess
     */
    public boolean isSuccess() {
        return isSuccess;
    }

    /**
     * Setter method for property <b>isSuccess</b>.
     *
     * @param success value be assigned to isSuccess
     */
    public void setSuccess(boolean success) {
        isSuccess = success;
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