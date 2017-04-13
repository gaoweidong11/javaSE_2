package java1702.javase.collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by 高伟冬 on 2017/4/12.
 * javaSE_2
 * 11:30
 * 星期三
 */
public class ListIeraatorTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        ListIterator<String> listIterator = strings.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
//            System.out.println(listIterator.nextIndex());
            System.out.println(next);
//            listIterator.set("f");
            listIterator.remove();
        }
        System.out.println(strings);

        System.out.println("---");

        while (listIterator.hasPrevious()) {
            String prev = listIterator.previous();
//            System.out.println(listIterator.previousIndex());
            if (prev.equals("c")) {
                listIterator.add("f");
            }
            System.out.println(prev);
        }
        System.out.println(strings);
        // prev
        // index
        // add
        // set
        // remove
    }
}
