package com.lql.utils.guava;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

/**
 * @author liqiuliang
 * @create 2023-09-06 2:16
 */
public class ImmutableTest {
    @Test
    public void testImmutalbe() {
        ImmutableList<Integer> build = ImmutableList.<Integer>builder()
                .add(1)
                .add(2)
                .build();
        ImmutableList<Integer> reverse = build.reverse();
        System.out.println(reverse);
    }
}
