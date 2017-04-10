package java1702.javase.newoop;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by 高伟冬 on 2017/4/10.
 * javaSE_2
 * 8:37
 * 星期一
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "a");
        hashtable.put(100, "hsdi");
        hashtable.remove(100);//按键清除
//        hashtable.clear();//清除
        System.out.println(hashtable.size());//键的个数（大小）
        System.out.println(hashtable.get(100));

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "->" + hashtable.get(integer));
        }
        for (String s : hashtable.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry);
        }
    }
}
