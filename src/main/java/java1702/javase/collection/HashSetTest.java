package java1702.javase.collection;

import java.util.HashSet;

/**
 * Created by 高伟冬 on 2017/4/11.
 * javaSE_2
 * 15:52
 * 星期二
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("test");
         //无序  效率高  没有get 方法
        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
