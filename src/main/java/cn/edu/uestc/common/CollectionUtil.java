/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.common;

import java.util.Collection;

/**
 * 集合工具类
 *
 * @author feixuan.fx
 * @version $Id: CollectionUtil.java, v 0.1 2018-05-03 11:19 feixuan.fx Exp $
 */
public class CollectionUtil {

    /**
     * 判断集合是否为空或长度为0
     *
     * @param collection 待判断的字符串
     * @return 是否为空或长度为0
     */
    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.size() == 0;
    }
}