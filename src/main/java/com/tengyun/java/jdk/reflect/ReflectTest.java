package com.tengyun.java.jdk.reflect;


import java.lang.reflect.Field;

/**
 * @author Adam Zhao
 */
public class ReflectTest {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        getFieldVal();
    }

    public static void getFieldVal() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> mathClass = Class.forName("java.lang.Math");
        Field pi = mathClass.getDeclaredField("PI");

        System.out.println(pi.get(null));
        System.out.println(pi.get(mathClass));
    }
}
