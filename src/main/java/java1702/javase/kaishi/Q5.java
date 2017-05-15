package java1702.javase.kaishi;

/**
 * Created by 高伟冬 on 2017/5/13.
 * javaSE_2
 * 8:30
 * 星期六
 */
//使用 wait 方法实现一次阻塞
public class Q5 implements Runnable{
    public static void main(String[] args) {
        Thread thread =new Thread();
        thread.start();
        try {
            thread.wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IllegalMonitorStateException ignored) {
        }
        thread.notify();
        System.out.println("test/...........");
    }

    @Override
    public void run() {

    }
}
