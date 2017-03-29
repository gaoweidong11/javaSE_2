package java1702.javase.collection;
/**
 * Created by 高伟冬 on 2017/3/29.
 * javaSE_2
 * 10:53
 * 星期三
 */
public class StringVsStringBufferTest {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s += ALPHABET;
            System.out.println(ALPHABET);
        }
        System.out.println("时间：" + (System.currentTimeMillis() - start));
        System.out.println(s.length());
    }
}
