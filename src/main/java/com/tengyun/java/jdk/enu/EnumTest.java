package com.tengyun.java.jdk.enu;

/**
 * @author Adam Zhao
 */
public class EnumTest {
    public static void main(String[] args) {
        testClass();
    }

    private static void testClass() {
        // 获取三个对象。
        Gender male = Gender.MALE;
        Gender female = Gender.FEMALE;
        Gender others = Gender.OTHERS;

        // class com.tengyun.java.jdk.enu.Gender
        System.out.println(male.getClass());

        System.out.println(female.getCode());
        System.out.println(others.getCode());

        Gender others2 = Gender.OTHERS;
        // 总是 true，每次获取该对象总是返回同一个。枚举这一点类似“单例模式“中的单例，只不过枚举是多例。
        System.out.println(others == others2);
    }
}

enum Gender {
    /**
     * MALE-男
     * FEMALE-女
     */
    MALE(1), FEMALE(0), OTHERS(2);

    private final Integer code;

    Gender (Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return this.code;
    }
}
