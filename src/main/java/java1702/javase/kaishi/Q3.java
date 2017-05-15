package java1702.javase.kaishi;

/**
 * Created by 高伟冬 on 2017/5/13.
 * javaSE_2
 * 8:30
 * 星期六
 */
//使用 sleep 方法实现一次阻塞
public class Q3 implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        System.out.println("test....");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}