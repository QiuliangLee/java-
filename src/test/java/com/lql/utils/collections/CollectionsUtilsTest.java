package com.lql.utils.collections;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @author liqiuliang
 * @create 2023-09-06 2:06
 */
public class CollectionsUtilsTest {
    @Test
    public void testNotNull() {
        System.out.println(CollectionUtils.isNotEmpty(new ArrayList<>()));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list2.add(1);
        Collection<Integer> intersection = CollectionUtils.subtract(list, list2);
        intersection.forEach(System.out::println);
    }
}
