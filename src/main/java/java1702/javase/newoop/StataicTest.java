package java1702.javase.newoop;

/**
 * Created by 高伟冬 on 2017/4/6.
 * javaSE_2
 * 11:25
 * 星期四
 */
public class StataicTest {
    private static int i;
    private int j ;

    public static void m() {

    }

    public static void main(String[] args) {
        StataicTest stataicTest = new StataicTest();
        stataicTest.j = 1;
        System.out.println(stataicTest.j);
    }
}
