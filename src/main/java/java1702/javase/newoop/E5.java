package java1702.javase.newoop;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by 高伟冬 on 2017/4/1.
 * javaSE_2
 * 14:16
 * 星期六
 */
public class E5 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        System.out.println("反转前：" + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后：" + arrayList);
    }
}
