package java1702.javase.kaishi;

/**
 * Created by 高伟冬 on 2017/5/13.
 * javaSE_2
 * 8:29
 * 星期六
 */
// 使用 Thread 类实现多线程
public class Q1 extends Thread{
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.start();
        Q1 q2 = new Q1();
        q2.start();
    }
}
