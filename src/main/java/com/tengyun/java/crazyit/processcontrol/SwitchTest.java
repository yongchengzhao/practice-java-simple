package com.tengyun.java.crazyit.processcontrol;


/**
 * @author Adam Zhao
 */
public class SwitchTest {
    public static void main(String[] args) {
        nameSwitch();
        scoreSwitch();
    }

    public static void nameSwitch() {
        String name = "Adam";

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

    public static void scoreSwitch() {
        char score = 'B';

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
}
