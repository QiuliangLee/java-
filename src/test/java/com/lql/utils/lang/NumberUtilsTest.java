package com.lql.utils.lang;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;

/**
 * @author liqiuliang
 * @create 2023-09-06 1:57
 */
public class NumberUtilsTest {
    /**
     * 判断字符串是不是整数
     */
    @Test
    public void testInteger() {
        String str = "a3";
        System.out.println(NumberUtils.isDigits(str));
    }
}
