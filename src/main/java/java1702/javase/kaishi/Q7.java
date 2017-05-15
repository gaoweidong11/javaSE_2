package java1702.javase.kaishi;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 高伟冬 on 2017/5/13.
 * javaSE_2
 * 8:31
 * 星期六
 */
//编写一个程序，开启3个线程，
// 这3个线程的 Name 分别为 A、B、C，
// 每个线程将自己的 Name 在屏幕上打印10遍，
// 要求输出结果必须按ABC 的顺序显示；如：ABCABC….依次递推
public class Q7{
    public static void main(String[] args) {
        Q7 obj = new Q7();
        obj.init();
    }

    private void init() {
        final Test3Business tb = new Test3Business();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    tb.printA();
                }
            }
        });
        t1.setName("A");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    tb.printB();
                }
            }
        });
        t2.setName("B");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    tb.printC();
                }
            }
        });
        t3.setName("C");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Test3Business {

    private String flag = "A";

    private Lock lock = new ReentrantLock();

    private Condition cA = lock.newCondition();
    private Condition cB = lock.newCondition();
    private Condition cC = lock.newCondition();

    public void printA () {
        try {
            lock.lock();
            if (!flag.equals("A")) {
                cA.await();
            }
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            flag = "B";
            cB.signal();
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printB () {
        try {
            lock.lock();
            if (!flag.equals("B")) {
                cB.await();
            }
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            flag = "C";
            cC.signal();
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printC () {
        try {
            lock.lock();
            if (!flag.equals("C")) {
                cC.await();
            }
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            flag = "A";
            cA.signal();
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
