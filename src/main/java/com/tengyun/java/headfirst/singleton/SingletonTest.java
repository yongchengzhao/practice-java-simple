package com.tengyun.java.headfirst.singleton;

import java.util.Objects;

/**
 * @author Adam Zhao
 */
public class SingletonTest {
    public static void main(String[] args) {
        multiThread();
    }

    public static void multiThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
                System.out.println(simpleSingleton1);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();
                System.out.println(simpleSingleton2);
            }
        }).start();
    }
}

/**
 * 1. 简单单例模式，线程不安全，一旦用两个线程并发创建对象，会获取到两个不同对象，这违背了单例设计模式。
 */
class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {}

    public static synchronized SimpleSingleton getInstance() {
        if (Objects.isNull(instance)) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SimpleSingleton();
        }
        return instance;
    }
}

/**
 * 2. 急切型单例模式，初始化类时就初始化单例对象，这样可保证并发获取到的对象为同一对象。该方法导致系统初始化和启动时间加长。
 */
class UrgentSingleton {
    private static UrgentSingleton urgentSingleton = new UrgentSingleton();

    private UrgentSingleton() {}

    public static UrgentSingleton getInstance() {
        return urgentSingleton;
    }
}

/**
 * 3. 如果对性能无要求，可使用这种方式。每次获取单例对象时加上同步锁。直接加锁，简单粗暴。
 */
class NonPerformanceSingleton {
    private static NonPerformanceSingleton nonPerformanceSingleton;

    private NonPerformanceSingleton() {}

    public synchronized static NonPerformanceSingleton getInstance() {
        if (Objects.isNull(nonPerformanceSingleton)) {
            nonPerformanceSingleton = new NonPerformanceSingleton();
        }
        return nonPerformanceSingleton;
    }
}

/**
 * 4. 双重检查加锁方法。既保证了性能，又保证了安全。
 */
class PerformanceSingleton {
    private volatile static PerformanceSingleton performanceSingleton;

    private PerformanceSingleton() {}

    public static PerformanceSingleton getInstance() {
        // 第一次检查，保证性能。如果非空则不进入同步代码块，因为同步代码块会影响性能。
        if (Objects.isNull(performanceSingleton)) {
            synchronized (PerformanceSingleton.class) {
                // 第二次检查，保证安全。当多条线程同时执行到同步代码块的上一行，
                // 进入同步代码块后直接创建对象会导致创建多个对象，再检查一次可避免该错误。
                if (Objects.isNull(performanceSingleton)) {
                    performanceSingleton = new PerformanceSingleton();
                }
            }
        }

        return performanceSingleton;
    }
}

/**
 * 上面 3 种线程安全的单例类只能保证线程安全，但是有一个漏洞--通过对象流反序列化对象可以获取到第二个实例。这违背了单例设计模式。
 * 李刚的方法可以防止此漏洞。
 */

class LeeSingleton {

}
