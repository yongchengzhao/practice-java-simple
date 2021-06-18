package com.tengyun.java.jdk.system;

import java.util.Map;

/**
 * @author Adam Zhao
 */
public class SystemTest {
    public static void main(String[] args) {
        System.out.println("-------------System.main()--------------");

        systemUtilMethod();
    }

    public static void systemUtilMethod() {
        // 获取变量指向的堆内存中对象的 id。
        var s1 = "Hello";
        System.out.println("identity hashcode: " + System.identityHashCode(s1));

        // 换行符？
        System.out.println("line separator: '" + System.lineSeparator() + "'");

        // 系统环境变量
        Map<String, String> envMap = System.getenv();
        System.out.println("envMap: " + envMap);

        // 当前毫秒
        System.out.println("current time millis: " + System.currentTimeMillis());

        // 纳秒
        System.out.println("nano time: " + System.nanoTime());

    }
}
