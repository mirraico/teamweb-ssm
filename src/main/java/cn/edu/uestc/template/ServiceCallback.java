/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.template;

/**
 * 服务执行回调类
 *
 * @author feixuan.fx
 * @version $Id: ServiceCallback.java, v 0.1 2018-05-02 20:13 feixuan.fx Exp $
 */
public interface ServiceCallback {

    /**
     * 执行服务前的检查
     *
     * @return
     * @throws Exception
     */
    boolean check() throws Exception;

    /**
     * 执行的服务
     */
    void service();

}