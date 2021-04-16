package com.tengyun.java.crazyit.thread;

/**
 * @author Adam Zhao
 */
public class RunnableTest {
    public static void main(String[] args) {
        // 创建线程
        Thread myRunnable1 = new Thread(new MyRunnable("myRunnable1"));
        Thread myRunnable2 = new Thread(new MyRunnable("myRunnable2"));
        Thread myRunnable3 = new Thread(new MyRunnable("myRunnable3"));

        // 启动线程
        myRunnable1.start();
        myRunnable2.start();
        myRunnable3.start();

        System.out.println("Exit main() method");
    }
}

class MyRunnable implements Runnable {

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // run() 方法体是任务
        int time = 100;
        for (int i = 0; i < time; i++) {
            System.out.println(this.getName() + "--------------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
