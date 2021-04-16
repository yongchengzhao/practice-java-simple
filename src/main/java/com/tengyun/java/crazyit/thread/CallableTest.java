package com.tengyun.java.crazyit.thread;

import org.w3c.dom.html.HTMLImageElement;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Adam Zhao
 */
public class CallableTest {
    public static void main(String[] args) throws Exception {
        Thread myCallable1 = new Thread(new FutureTask<>(new MyCallable("myCallable1")));
        Thread myCallable2 = new Thread(new FutureTask<>(new MyCallable("myCallable2")));
        Thread myCallable3 = new Thread(new FutureTask<>(new MyCallable("myCallable3")));

        myCallable1.start();
        myCallable2.start();
        myCallable3.start();

        System.out.println("Exit main() method");
    }
}

class MyCallable implements Callable<Boolean> {

    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        int time = 100;
        for (int i = 0; i < time; i++) {
            System.out.println(this.getName() + "-------------");
        }

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
