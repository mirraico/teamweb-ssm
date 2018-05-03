/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.common;

/**
 * 字符串工具类
 *
 * @author feixuan.fx
 * @version $Id: StringUtil.java, v 0.1 2018-05-03 10:43 feixuan.fx Exp $
 */
public class StringUtil {

    /**
     * 判断两个字符串是否相等
     *
     * @param str1 字符串1
     * @param str2 字符串2
     * @return 是否相等
     */
    public static boolean equals(String str1, String str2) {
        if (str1 == null) {
            return str2 == null;
        } else {
            return str1.equals(str2);
        }
    }

    /**
     * 判断字符串是否为空或长度为0
     *
     * @param str 待判断的字符串
     * @return 是否为空或长度为0
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 判断字符串是否为空或空白字符串
     *
     * @param str 待判断的字符串
     * @return 是否为空或空白字符串
     */
    public static boolean isBlank(String str) {
        if (!isEmpty(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}