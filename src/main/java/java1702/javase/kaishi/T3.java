package java1702.javase.kaishi;

import java.lang.String;

/**
 * Created by 高伟冬 on 2017/4/8.
 * javaSE_2
 * 14:26
 * 星期六
 */
public class T3 {
    public static void main(String[] args) {

        String str = "Hello World";

        String[] s = str.split(" ");
        for (String value : s)
            System.out.println(value + "\t");

        System.out.println("转换成大写：" + s[0].toUpperCase());
        System.out.println("转化成小写：" + s[1].toLowerCase());

        String num = "20011001";


    }
}
