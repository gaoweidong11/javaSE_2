package java1702.javase.collection;

import java.util.TreeMap;

/**
 * Created by 高伟冬 on 2017/4/12.
 * javaSE_2
 * 9:48
 * 星期三
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "a");
        map.put(2, "b");

        System.out.println(map.size());
        System.out.println(map.get(2));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + "=>" + map.get(integer));
        }
    }
}
