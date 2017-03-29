package java1702.javase.collection;

/**
 * Created by 高伟冬 on 2017/3/29.
 * javaSE_2
 * 8:56
 * 星期三
 */
public class StringTestDome {
    public static void main(String[] args) {
        String s = "hello world!";
        System.out.println(s.matches("l"));
        System.out.println(s.replace('l','a'));
        System.out.println(s.replaceAll("l", "a"));
        System.out.println(s.replaceFirst("l","a"));

        String[] strings = s.split("l");
        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(s.substring(6,11));
    }
}
