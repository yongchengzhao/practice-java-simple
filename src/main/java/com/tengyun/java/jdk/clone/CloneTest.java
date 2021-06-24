package com.tengyun.java.jdk.clone;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Adam Zhao
 */
@Data
@AllArgsConstructor
public class CloneTest implements Cloneable {

    private String name;

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        CloneTest ct1 = new CloneTest("Adam");
        System.out.println("ct1: " + ct1);
        System.out.println("ct1 identity hash code: " + System.identityHashCode(ct1));
        System.out.println("ct1 hash code: " + ct1.hashCode());

        try {
            CloneTest ct2 = (CloneTest) ct1.clone();
            System.out.println("ct2: " + ct2);
            System.out.println("ct2 identity hash code: " + System.identityHashCode(ct2));
            System.out.println("ct2 hash code: " + ct2.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("不允许克隆");
        }
    }
}
