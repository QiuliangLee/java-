package com.lql.utils.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.StandardLineSeparator;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ClassUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author liqiuliang
 * @create 2023-09-06 2:11
 */
public class FileUtilsTest {
    @Test
    public void testFileInput() throws IOException {
        String path="D:\\workspace_idea2019\\guava\\src\\test\\java\\com\\lql\\utils\\io\\test";
        String s = FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8);
        System.out.println(s);
        ClassUtils
    }
}
