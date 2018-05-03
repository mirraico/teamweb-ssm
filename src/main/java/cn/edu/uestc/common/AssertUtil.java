/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.common;

import java.util.Collection;

/**
 * 断言工具类
 *
 * @author feixuan.fx
 * @version $Id: AssertUtil.java, v 0.1 2018-05-03 11:11 feixuan.fx Exp $
 */
public class AssertUtil {

    /**
     * 断言所有字符串是否为空或空白字符串，若不是则抛出异常
     *
     * @param e 抛出的异常
     * @param strArr 要断言的字符串
     */
    public static void assertNotBlank(RuntimeException e, String... strArr) {
        for (String str : strArr) {
            if (StringUtil.isBlank(str)) {
                throw e;
            }
        }
    }

    /**
     * 断言所有字符串是否为空或长度为0，若不是则抛出异常
     *
     * @param e 抛出的异常
     * @param strArr 要断言的字符串
     */
    public static void assertNotEmpty(RuntimeException e, String... strArr) {
        for (String str : strArr) {
            if (StringUtil.isEmpty(str)) {
                throw e;
            }
        }
    }

    /**
     * 断言所有集合是否为空或长度为0，若不是则抛出异常
     *
     * @param e 抛出的异常
     * @param collectionArr 要断言的集合
     */
    public static void assertNotEmpty(RuntimeException e, Collection... collectionArr) {
        for (Collection collection : collectionArr) {
            if (CollectionUtil.isEmpty(collection)) {
                throw e;
            }
        }
    }

    /**
     * 断言所有对象是否为空，若不是则抛出异常
     *
     * @param e 抛出的异常
     * @param objArr 要断言的对象
     */
    public static void assertNotNull(RuntimeException e, Object... objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw e;
            }
        }
    }
}