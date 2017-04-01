package java1702.javase.newoop;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/4/1.
 * javaSE_2
 * 14:08
 * 星期六
 */
public class E3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String str = sc.next();

        Map<String, Integer> map = new LinkedHashMap<>();

        int len;

        while (str.length() > 0) {

            len = str.length();

            String s = str.substring(0, 1);

            str = str.replaceAll(s, "");

            map.put(s, len - str.length());
        }

        System.out.println(map);
    }
}
