package java1702.javase.collection;

import java.util.LinkedHashSet;

/**
 * Created by 高伟冬 on 2017/4/11.
 * javaSE_2
 * 16:08
 * 星期二
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
//按顺序输出   a b c d
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
