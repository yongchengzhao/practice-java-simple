package com.tengyun.java.crazyit.processcontrol;


/**
 * @author Adam Zhao
 */
public class SwitchTest {
    public static void main(String[] args) {
        stringSwitch("Adam");
        charSwitch('A');
        enumSwitch(Gender.MALE);
    }

    public static void stringSwitch(String name) {
        switch (name.toLowerCase()) {
            case "god":
                System.out.println("上帝");
                break;
            case "adam":
                System.out.println("亚当");
                break;
            case "eve":
                System.out.println("夏娃");
                break;
            default:
                System.out.println("其他");
        }
    }

    public static void charSwitch(char score) {
        switch (score) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("其他");
        }
    }

    public static void enumSwitch(Gender gender) {
        switch (gender) {
            case FEMALE:
                System.out.println("女，编码：" + Gender.FEMALE.getCode());
                break;
            case MALE:
                System.out.println("男，编码：" + Gender.MALE.getCode());
                break;
            case OTHERS:
                System.out.println("其他，编码：" + Gender.OTHERS.getCode());
                break;
            default:
                System.out.println("枚举错误");
        }
    }
}

enum Gender {
    /**
     * 性别
     */
    FEMALE((byte) 0),
    MALE((byte) 1),
    OTHERS((byte) 2);

    /**
     * 性别编码
     */
    private final byte code;

    Gender(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }
}
