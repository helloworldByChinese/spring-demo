package com.baoyong.test;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author JiangBaoyong
 * @date 2020/07/20
 **/
public class LockTest {
    private static Lock lock = new ReentrantLock();
    private static Condition condition1 = lock.newCondition();
    private static Condition condition2 = lock.newCondition();
    private static AtomicInteger count = new AtomicInteger(0);
    private static volatile int number = 1;
    private static int RUN_ACCOUNT = 15;


    @Test
    void testLock() {
        new Thread(() -> {
            while (count.get() < RUN_ACCOUNT) {
                lock.lock();
                try {
                    while(number != 1) {
                        condition1.await();
                    }
                    for (int i = 0; i < 10; i++) {
                        if (count.get() < RUN_ACCOUNT) {
                            count.incrementAndGet();
                            System.out.println("执行子线程第" + i + "次");
                        } else {
                            break;
                        }
                    }
                    number = 2;
                    condition2.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
            System.out.println("子线程结束运行");
        }).start();

        while (count.get() < RUN_ACCOUNT) {
            lock.lock();
            try {
                while (number != 2) {
                    condition2.await();
                }
                for (int i = 0; i < 20; i++) {
                    if (count.get() < RUN_ACCOUNT) {
                        count.incrementAndGet();
                        System.out.println("执行主线程第" + i + "次");
                    } else {
                        break;
                    }
                }
                number = 1;
                condition1.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        System.out.println("主线程结束运行");
    }

}
