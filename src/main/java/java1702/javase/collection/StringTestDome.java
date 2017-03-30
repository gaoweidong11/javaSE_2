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
        System.out.println(s.matches("l"));//匹配
        System.out.println(s.replace('l','a'));//代替
        System.out.println(s.replaceAll("l", "a"));//代替全部
        System.out.println(s.replaceFirst("l","a"));//代替第一个

        String[] strings = s.split("l");//分离
        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(s.substring(6,11));
    }
}
