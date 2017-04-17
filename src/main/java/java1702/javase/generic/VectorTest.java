package java1702.javase.generic;

import java.util.Vector;

/**
 * Created by 高伟冬 on 2017/4/13.
 * javaSE_2
 * 10:00
 * 星期四
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("test...");
        strings.add("hello");
        strings.add("456");

        String s = strings.get(2);
        System.out.println(s);
    }
}
