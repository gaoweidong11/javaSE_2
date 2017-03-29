package java1702.javase.collection;

import java.util.Hashtable;

/**
 * Created by 高伟冬 on 2017/3/29.
 * javaSE_2
 * 15:37
 * 星期三
 */
//    hash  搞砸    table   目录
public class HashtableTest {
    public static void main(String[] args) {
        // K - key  键    V - value 值
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");
        hashtable.put(2, "hello");

        System.out.println(hashtable.get(2));
    }
}
