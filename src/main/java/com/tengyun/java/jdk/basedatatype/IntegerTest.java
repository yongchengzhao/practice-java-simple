package com.tengyun.java.jdk.basedatatype;

/**
 * @author Adam Zhao
 */
public class IntegerTest {
    public static void main(String[] args) {
        testBinary();
    }

    public static void testBinary() {
        int i = 9;
        // 1001
        System.out.println(Integer.toBinaryString(i));
        // 11
        System.out.println(Integer.toOctalString(i));
        // 9
        System.out.println(Integer.toHexString(i));
        // 9
        System.out.println(Integer.toUnsignedString(i));
    }
}
