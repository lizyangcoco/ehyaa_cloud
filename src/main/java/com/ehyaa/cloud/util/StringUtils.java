package com.ehyaa.cloud.util;

/**
 * 类描述：字符串处理类
 *
 * @author 李泽阳 on 2019/12/23 9:37
 */
public class StringUtils {

    /**
     * 检查数据串中是否包含非法字符集
     *
     * @param str
     * @return [true]|[false] 包含|不包含
     */
    public static boolean check(String str) {
        String sIllegal = "'\"";
        int len = sIllegal.length();
        if (null == str)
            return false;
        for (int i = 0; i < len; i++) {
            if (str.indexOf(sIllegal.charAt(i)) != -1)
                return true;
        }
        return false;
    }

    /**
     * 判断字符串是否未空，为空（为null，为""，）返回true
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (null != str && !"".equals(str)) {
            return false;
        }
        return true;
    }

    /**
     * 判断对象是否为空，不为空（不为null，不为""，）返回true
     *
     * @param obj
     * @return
     */
    public static boolean isNotEmpty(Object obj) {
        boolean objType = false;
        if (null != obj && !"".equals(obj)) {
            if (obj.toString().length() > 0) {
                objType = true;
            }
        } else {
            objType = false;
        }
        return objType;

    }

}
