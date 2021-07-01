package com.tengyun.java.jdk.array;

import java.util.Arrays;

/**
 * @author Adam Zhao
 */
public class ArrayTest {
    public static void main(String[] args) {
        iteratorArr();
    }

    public static void iteratorArr() {
        int[] intArr = new int[5];
        System.out.println(Arrays.toString(intArr));

        intArr[1] = 3;
        System.out.println(Arrays.toString(intArr));
    }
}
