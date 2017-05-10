package java1702.javase.multithreading;

/**
 * Created by 高伟冬 on 2017/5/9.
 * javaSE_2
 * 9:13
 * 星期二
 */
public class YieldTest implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new YieldTest(), "thread 1");
        Thread thread1 = new Thread(new YieldTest(), "thread2");
        thread.start();
        thread1.start();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i+":"+Thread.currentThread().getName()+"is sunning");
            if (i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}
