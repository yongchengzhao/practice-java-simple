package com.tengyun.java.crazyit.thread;

/**
 * @author Adam Zhao
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("===================Thread Test===============");

        // 创建线程
        MyThread myThread1 = new MyThread("myThread1");
        MyThread myThread2 = new MyThread("myThread2");
        MyThread myThread3 = new MyThread("myThread3");

        // 启动线程
        myThread1.start();
        myThread2.start();
        myThread3.start();

        System.out.println("Exit main() method");
    }
}

class MyThread extends Thread {

    public MyThread() {}

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // run() 方法的方法体执行任务代码
        int time = 100;
        for (int i = 0; i < time; i++){
            System.out.println(this.getName() + "-------------");
        }
    }
}
