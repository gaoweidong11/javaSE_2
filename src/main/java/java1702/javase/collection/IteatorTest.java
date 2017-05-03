package java1702.javase.collection;

import java.util.*;


/**
 * Created by 高伟冬 on 2017/4/12.
 * javaSE_2
 * 10:53
 * 星期三
 */
public class IteatorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        for (String aList : list) {
            System.out.println(aList);
        }

        TreeSet<String> set = new TreeSet<>();
        set.add("b");
        set.add("a");

        for (String aSet : set) {
            System.out.println(aSet);
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "bcd");

        for (Integer key : map.keySet()) {
            System.out.println(key + ">" + map.get(key));
        }
    }
}
