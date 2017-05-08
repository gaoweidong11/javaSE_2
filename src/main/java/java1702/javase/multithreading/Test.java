package java1702.javase.multithreading;

/**
 * Created by 高伟冬 on 2017/5/8.
 * javaSE_2
 * 9:28
 * 星期一
 */
public class Test implements Runnable {
    public static void main(String[] args) {
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();

        System.out.println("test....");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

//    private static void run() {
//
//    }
}
