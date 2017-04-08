package java1702.javase.newoop;

import java.util.Arrays;

/**
 * Created by 高伟冬 on 2017/4/7.
 * javaSE_2
 * 13:40
 * 星期五
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);
        //GC  Garbage Collection  垃圾回收机制
// charAt
        System.out.println("hello".charAt(4));
//concat concatenate
        System.out.println("test1".concat("test2"));
//contains
        System.out.println("test1".contains("1"));
//endsWith
        System.out.println("test1".endsWith("t2"));
//equals
        System.out.println("test1".equals("Test1"));
        System.out.println("test1".equalsIgnoreCase("Test1"));
//indexOf
        System.out.println("test1".indexOf("t")); // 0
//lastIndexOf
        System.out.println("test1".lastIndexOf("t")); // 3
//length
        System.out.println("test1测试".length());
//replace
        System.out.println("tets1".replace("ts", "st"));
//split
        System.out.println(Arrays.toString("test1".split("1")));
//startWith
        System.out.println("test1".startsWith("tes"));
//subString
        System.out.println("test1".substring(1, 4));
//toCharArray
        System.out.println(Arrays.toString("test1".toCharArray()));
//toLowerCase
        System.out.println("test1".toLowerCase());
//toUpperCase
        System.out.println("test1".toUpperCase());
//trim
        System.out.println("test1".trim());
//valueOf
        System.out.println();
    }
}
