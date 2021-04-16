package com.tengyun.java.jdk.collection;

import java.util.List;
import java.util.Random;

/**
 * @author Adam Zhao
 */
public class ListTest {
    public static void main(String[] args) {
        testListOf();
    }

    public static void testListOf() {
        Random rd = new Random();

        List<Integer> intList = List.of(rd.nextInt(9), rd.nextInt(7), rd.nextInt(19));
        System.out.println(intList);
        System.out.println(intList.getClass());

        List<Double> doubleList = List.of(rd.nextDouble(), rd.nextDouble(), Math.PI, Math.E);
        System.out.println(doubleList);
        System.out.println(doubleList.getClass());
    }
}
