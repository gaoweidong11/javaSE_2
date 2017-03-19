package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/24.
 * javaSE_2
 * 8:58
 * 星期五
 */
public class ScopeTest {
    private int j;

    public void method() {
        int j = 1;
        System.out.println(j);

        for (int k = 0; k < 10; k++) {
            k = 10;
            System.out.println(k);
            k = 20;
            System.out.println(k);
        }
    }

    public void Dome() {
        String s;
        try {
            s = "Hello";
        } catch (Exception ignored) {
            s = "hi";
        }
    }
}

