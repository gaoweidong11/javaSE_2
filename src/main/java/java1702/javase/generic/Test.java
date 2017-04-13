package java1702.javase.generic;

import java.util.Date;

/**
 * Created by 高伟冬 on 2017/4/13.
 * javaSE_2
 * 8:52
 * 星期四
 */
public class Test<T> {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.concat(1,2));
        System.out.println(test.concat(1.2,2.3));
        System.out.println(test.concat(new Date(),new Date()));

    }
    private String concat(T x, T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
