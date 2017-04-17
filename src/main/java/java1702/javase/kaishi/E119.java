package java1702.javase.kaishi;

import java.util.*;


/**
 * Created by 高伟冬 on 2017/4/15.
 * javaSE_2
 * 8:47
 * 星期六
 */
//输入一段字符串，字符串中只包含大小写字母。
// 要求完成函数删除给定字符串中出现次数最少的字符。
// 输出删除完的字符串。如果有多个出现次数一样的字符，
// 都为最少时，一并删除。
// 例如：输入:abbccd，输出为bbcc

public class E119 {
    public static void main(String[] args) {
        E119 x = new E119();
        String result = x.getMinString();
        System.out.println(result);
    }

    private String getMinString() {
        System.out.println("原字符串:" + "abbccd");
        char[] c = "abbccd".toCharArray();
        List<String> list = new ArrayList<>();
        for (char aC : c) list.add(aC + "");
        int minTime = 0;
        int[] count = new int[list.size()];
        for (int i = 0; i < count.length; i++)
            count[i] = 0;

        for (int i = 0; i < list.size(); i++) {
            for (String aList : list) {
                if (list.get(i).equals(aList))
                    count[i]++;
            }
            minTime = count[1];
            if (minTime >= count[i])
                minTime = count[i];
        }
        System.out.println("每个字母出现次数:" + Arrays.toString(count));
        System.out.println("字母出现的最小次数" + minTime);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > minTime)
                sb.append(list.get(i));
        }
        return sb.toString();

    }

}

