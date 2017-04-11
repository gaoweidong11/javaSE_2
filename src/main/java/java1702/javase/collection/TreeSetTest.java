package java1702.javase.collection;

import java.util.TreeSet;

/**
 * Created by 高伟冬 on 2017/4/11.
 * javaSE_2
 * 16:11
 * 星期二
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("c");
        strings.add("d");
        strings.add("b");
         //按元素值来排序
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
