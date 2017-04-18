package java1702.javase.exception;

/**
 * Created by 高伟冬 on 2017/4/17.
 * javaSE_2
 * 9:08
 * 星期一
 */
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("hello".charAt(5));//	java.lang.StringIndexOutOfBoundsException
            System.out.println((new int[]{1, 2, 3})[0]);//	java.lang.ArrayIndexOutOfBoundsException
            System.out.println(1 / 2);//	java.lang.ArithmaticException
            String s = "hi";
            //  s=null;
            System.out.println(s.toUpperCase());//	java.lang.NullPointerException
        } catch (Exception a) {
//            a.printStackTrace();
            System.err.println("异常。。");
        }

        try {
            System.out.println(Integer.valueOf("12l"));//	java.lang.NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("错误");
        }

        System.out.println("test...");
    }
}
