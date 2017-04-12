package java1702.javase.collection;

import java.util.*;

/**
 * Created by 高伟冬 on 2017/4/12.
 * javaSE_2
 * 9:00
 * 星期三
 */
public class HashMapTest {
    public static void main(String[] args) {
       HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"b");
        map.put(4,"c");

        System.out.println(map.size());

        System.out.println(map.get(3));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + "->" + map.get(integer));
        }
        for (String s : map.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-》"+entry.getValue());
        }
    }
}
