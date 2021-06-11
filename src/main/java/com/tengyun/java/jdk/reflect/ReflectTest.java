package com.tengyun.java.jdk.reflect;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Adam Zhao
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        getFieldVal();
        invokeMethod();
    }

    public static void getFieldVal() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> mathClass = Class.forName("java.lang.Math");
        Field pi = mathClass.getDeclaredField("PI");

        System.out.println(pi.get(null));
        System.out.println(pi.get(mathClass));
    }

    public static void invokeMethod() throws Exception {
        Method abs = Math.class.getDeclaredMethod("abs", double.class);
        double douVal = (double) abs.invoke(null, -3.14);
        System.out.println(douVal);

        Method pow = Math.class.getDeclaredMethod("pow", double.class, double.class);
        double powResult = (double) pow.invoke(null, 2, 3);
        System.out.println(powResult);
    }
}
