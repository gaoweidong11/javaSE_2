package java1702.javase.newoop;

/**
 * Created by 高伟冬 on 2017/4/7.
 * javaSE_2
 * 8:56
 * 星期五
 */
public class PrimitivesTest {
    //    private static void test(double i) {
//        System.out.println("b:" + i);
//        i++;
//        System.out.println("c:" + i);
//    }
//
//    public static void main(String[] args) {
//        int i = 0;
//        System.out.println("a:" + i);
//        test(i);
//        System.out.println("d:" + i);
//
//    }
    private static void swap(String a) {
        a = "Hello,Word";
        //改变参数a的值后输出
        System.out.println("第二次输出:" + a);
    }

    public static void main(String[] args) {

        String a = "您好!";
        //未调用方法前输出
        System.out.println("第一次输出:" + a);
        swap(a);
        //调用完方法后输出
        System.out.println("第三次输出:" + a);
    }


}
