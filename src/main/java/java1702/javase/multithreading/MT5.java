package java1702.javase.multithreading;

/**
 * Created by 高伟冬 on 2017/5/8.
 * javaSE_2
 * 16:28
 * 星期一
 */
public class MT5 implements Runnable {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MT5());
        thread1.setName("thread 1");
        Thread thread2 = new Thread(new MT5());
        thread2.setName("thread 2");
        Thread thread3 = new Thread(new MT5());
        thread3.setName("thread 3");

        thread1.start();
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            try {
                Thread.sleep(1000 * 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}