package java1702.javase.collection;

import java.util.*;

/**
 * Created by 高伟冬 on 2017/4/11.
 * javaSE_2
 * 9:51
 * 星期二
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("c");
        strings.add("b");

        System.out.println(strings.size());//元素的个数
        System.out.println(strings.get(1));//输出索引对应的值

        System.out.println("-----------");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("------------");

        System.out.println(strings.getFirst());//输出第一个元素
        System.out.println(strings.getLast());//输出最后一个元素
    }
}
