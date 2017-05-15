package java1702.javase.kaishi;

/**
 * Created by 高伟冬 on 2017/5/13.
 * javaSE_2
 * 8:31
 * 星期六
 */
// 编写一个程序，子线程循环 10 次，
// 接着主线程循环 100 次，
// 接着又回到子线程循环 10 次，
// 接着再回到主线程又循环 100 次，如此循环50次
public class Q6 {
    public static void main(String[] args) {
        new Thread(//子线程
                new Runnable() {
                    public void run() {
                        for (int i = 1; i <= 50; i++)
                            synchronized (Q6.class) {
                                for (int j = 1; j <= 10; j++) {
                                    System.out.println("sub thread: " + i + ",loop: " + j);
                                }
                            }
                    }
                }
        ).start();

        new Thread(//主线程
                new Runnable() {
                    public void run() {
                        for (int i = 1; i <= 50; i++)
                            synchronized (Q6.class) {
                                for (int j = 1; j <= 100; j++) {
                                    System.out.println("main thread: " + i + ",loop: " + j);
                                }
                            }
                    }
                }
        ).start();
    }
}
