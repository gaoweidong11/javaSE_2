package java1702.javase;

/**
 * Created by 高伟冬 on 2017/3/28.
 * javaSE_2
 * 11:50
 * 星期二
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "asdf";

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(chars);

        System.out.println(s2);

        for (char c : s2.toCharArray()) {
            System.out.println(c);
        }

        String s3 = "Hello"; // hello HELLO
    }
}
