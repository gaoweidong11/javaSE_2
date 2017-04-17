package java1702.javase.kaishi;

import java.util.Arrays;

/**
 * Created by 高伟冬 on 2017/4/15.
 * javaSE_2
 * 8:46
 * 星期六
 */
//拆分字符串，字符串中含有逗号和数字，对数字排序并输出
//例如：String s0=”123,45,25,85”;
//        输出：25 45 85 123

public class E118 {
    public static void main(String[] args) {
        String s = "123,45,25,85";
        String[] s1 = s.split(",");
        int[] a = new int[s1.length];

        for (int i = 0; i < a.length; i++)
            a[i] = Integer.parseInt(s1[i]);
        Arrays.sort(a);
        for (int number : a)
            System.out.print(number + " ");
    }
}

