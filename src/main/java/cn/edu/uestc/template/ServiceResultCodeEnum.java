/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.template;

/**
 * 服务执行结果码枚举类
 *
 * @author feixuan.fx
 * @version $Id: ServiceResultCodeEnum.java, v 0.1 2018-05-02 20:20 feixuan.fx Exp $
 */
public enum ServiceResultCodeEnum {

    /**
     * 执行成功
     */
    SUCCESS("SUCCESS", "执行成功"),

    /**
     * 执行失败
     */
    FAIL("FAIL", "执行失败"),

    /**
     * 参数不合法
     */
    INVALID_PARAM("INVALID_PARAM", "参数不合法"),

    /**
     * 权限错误
     */
    NO_PERMISSION("NO_PERMISSION", "权限错误"),

    /**
     * 数据库异常
     */
    DATA_EXCEPTION("DATA_EXCEPTION", "数据库异常"),

    /**
     * 未知异常
     */
    UNKNOWN_EXCEPTION("UNKNOWN_EXCEPTION", "未知异常");

    /**
     * 结果码
     */
    private String code;

    /**
     * 描述
     */
    private String description;

    /**
     * 构造方法
     *
     * @param code 结果码
     * @param description 描述
     */
    ServiceResultCodeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * 通过结果码字符串获得结果码
     *
     * @param str 结果码字符串
     * @return 对应的结果码
     */
    public static ServiceResultCodeEnum getByCode(String str) {
        if (str == null) {
            return null;
        }
        for (ServiceResultCodeEnum resultCode : values()) {
            if (resultCode.getCode().equals(str)) {
                return resultCode;
            }
        }
        return null;
    }

    /**
     * Getter method for property <b>code</b>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <b>code</b>.
     *
     * @param code value be assigned to code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <b>description</b>.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property <b>description</b>.
     *
     * @param description value be assigned to description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}