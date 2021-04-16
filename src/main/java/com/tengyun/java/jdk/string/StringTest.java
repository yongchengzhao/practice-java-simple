package com.tengyun.java.jdk.string;

/**
 * @author Adam Zhao
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println("Test string");

        testCompare();
    }

    public static void testCompare() {
        String s1 = "God";
        String s2 = "Adam";
        String s3 = "Eve";

        // s1.compareTo(s2) 就相当于 s1 - s2
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.compareTo(s2));
    }
}
