package java1702.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 高伟冬 on 2017/4/11.
 * javaSE_2
 * 8:58
 * 星期二
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> string1 = new ArrayList<>();
        string1.add("a");
        string1.add("b");
        string1.add("c");

        List<String> string2 = new ArrayList<>();
        string2.add("a");
        string2.add("b");

        System.out.println(string1.equals(string2));//比较 元素是否相同
        string1.iterator();//返回按适当顺序在列表的元素上进行迭代的迭代器。

        List<String> string3 = new ArrayList<>(string2.subList(0,2));//截取相同的元素
        System.out.println(string3);
        System.out.println("-----------");
        System.out.println(string3.containsAll(string1));//查看列表是否有指定元素，有为true，没有为false。
        System.out.println("-----------");

        string1.removeAll(string2);//从列表中移除指定的元素
        System.out.println(string1);

        string1.retainAll(string2);  //仅保留指定元素，移除未包含的元素，若没有指定元素 ，抛出异常UnsupportedOperationException。
        System.out.println(string1);

    }
}
