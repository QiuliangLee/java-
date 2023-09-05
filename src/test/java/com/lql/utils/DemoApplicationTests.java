package com.lql.utils;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(StringUtils.isEmpty(""));
        String str="15687176251";
        String left = StringUtils.left(str, 3);
        String right = StringUtils.right(str, 4);
        System.out.println(left+"****"+right);
    }

}
