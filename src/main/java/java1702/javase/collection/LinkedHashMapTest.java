package java1702.javase.collection;

import javafx.scene.media.SubtitleTrack;

import java.util.LinkedHashMap;

/**
 * Created by 高伟冬 on 2017/4/12.
 * javaSE_2
 * 9:36
 * 星期三
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "a");
        map.put(-1, "b");
        map.put(100, "c");
        //按元素的添加顺序  有序

        System.out.println(map.size());
        System.out.println(map.get(-1));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + "->" + map.get(integer));
        }
    }
}
