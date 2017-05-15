package java1702.javase.kaishi;

import java.nio.channels.NonWritableChannelException;

/**
 * Created by 高伟冬 on 2017/5/13.
 * javaSE_2
 * 8:29
 * 星期六
 */
 //使用 Runnable 接口实现多线程
public  class Q2 implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setName("线程1");
        Thread thread1 = new Thread();
        thread1.setName("线程2");

        thread.start();
        thread1.start();
        System.out.println("test...");
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
