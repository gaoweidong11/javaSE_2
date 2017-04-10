package java1702.javase.newoop;

import java.util.*;

/**
 * Created by 高伟冬 on 2017/4/10.
 * javaSE_2
 * 9:59
 * 星期一
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        System.out.println(list.size());
        System.out.println(list.get(1));

        for (String s : list) {
            System.out.println(s);
        }

    }
}
