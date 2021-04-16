package com.tengyun.java.crazyit.thread;

/**
 * @author Adam Zhao
 */
public class RunnableTest {
    public static void main(String[] args) {
        // 创建线程
        Thread thread1 = new Thread(new MyRunnable("thread1"));
        Thread thread2 = new Thread(new MyRunnable("thread2"));
        Thread thread3 = new Thread(new MyRunnable("thread3"));

        // 启动线程
        thread1.start();
        thread2.start();
        thread3.start();

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
