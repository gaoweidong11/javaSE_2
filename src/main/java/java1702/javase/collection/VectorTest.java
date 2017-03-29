package java1702.javase.collection;

import java.util.*;

/**
 * Created by 高伟冬 on 2017/3/29.
 * javaSE_2
 * 13:48
 * 星期三
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();//  <>   表示类型
//        vector.add(1);
//        vector.add(1.2d);
        vector.add("adc");
        vector.add("abc");
        System.out.println(vector.get(1));//是输出第几个

        System.out.println(vector.size());//输出有几个

        System.out.println("--------------");
        System.out.println(vector.capacity());
        System.out.println();
        for (String s : vector) {
            System.out.println(s);//
        }
        System.out.println(vector.capacity());//capacity  容器大小

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");

        System.out.println(set.size());


    }
}
