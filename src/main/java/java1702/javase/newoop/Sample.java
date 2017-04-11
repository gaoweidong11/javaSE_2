package java1702.javase.newoop;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
  /*
   * 1、编写一个学生类，将学生的姓名，年龄，性别分别保存到HashSet, ArrayList,
   * Hashtable中，并利用迭代器Iterator将姓名，年龄，性别打印出来。
   */


        Set<String> s = new HashSet<>();
        s.add("张三");
        s.add("18");
        s.add("男");
        for (String value : s) {
            System.out.println(value);
        }


        List<String> list = new ArrayList<>();
        list.add("李四");
        list.add("16");
        list.add("男");
        for (Object aList : list) {
            System.out.println(aList);
        }

        Map<String, String> m = new Hashtable<>();
        m.put("1", "张三");
        m.put("2", "18");
        m.put("3", "男");
        for (Map.Entry<String, String> stringStringEntry : m.entrySet()) {
            System.out.println(stringStringEntry);
        }


    }
}