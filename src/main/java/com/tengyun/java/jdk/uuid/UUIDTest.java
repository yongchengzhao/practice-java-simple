package com.tengyun.java.jdk.uuid;

import java.util.UUID;

/**
 * @author Adam Zhao
 */
public class UUIDTest {
    public static void main(String[] args) {
        createUuid();
    }

    public static void createUuid() {
        UUID u1 = UUID.randomUUID();
        UUID u2 = UUID.randomUUID();

        // u1: 3ca5f128-5536-47b9-85fe-9020cb397f8c
        System.out.println("u1: " + u1);
        // u2: 8961cd7b-3c19-40cc-a1eb-e4d26ea751d6
        System.out.println("u2: " + u2);
        System.out.println(u1.compareTo(u2));
    }
}
