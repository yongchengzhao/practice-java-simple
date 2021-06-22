package com.tengyun.java.crazyit.processcontrol;

/**
 * @author Adam Zhao
 */
public class ForTest {
    public static void main(String[] args) {
        forTest1();
    }

    public static void forTest1() {
        int counter = 3;
        // for 循环的括号中第二个分号后面的代码甚至可以调用方法。
        for (int i = 0; i < counter; printI(i)) {
            System.out.println("for------------");
            i++;
        }
    }

    private static void printI(int i) {
        System.out.println(i);
    }
}
