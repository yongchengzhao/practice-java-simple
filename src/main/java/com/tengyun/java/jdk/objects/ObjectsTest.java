package com.tengyun.java.jdk.objects;

import java.util.Objects;

/**
 * @author Adam Zhao
 */
public class ObjectsTest {
    public static void main(String[] args) {
        System.out.println("-----------------Objects.main()---------------");
        objectsUtilMethod();
    }

    public static void objectsUtilMethod() {
        // 判断对象非空
        String s1 = "Adam";
        System.out.println("non null: " + Objects.nonNull(s1));

        // 判断对象为空
        String s2 = null;
        System.out.println("is null: " + Objects.isNull(s2));
    }
}
