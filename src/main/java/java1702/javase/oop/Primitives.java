package java1702.javase.oop;



/**
 * Created by 高伟冬 on 2017/3/24.
 * javaSE_2
 * 11:27
 * 星期五
 */
public class Primitives {
        private static void method(int i) {
        System.out.println(i + "b");
        i++;
        System.out.println(i + "c");

    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println(i + "a");
        method(i);
        System.out.println(i + "d");
    }

}

