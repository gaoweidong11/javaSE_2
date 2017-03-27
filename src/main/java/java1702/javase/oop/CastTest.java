package java1702.javase.oop;
/**
 * Created by 高伟冬 on 2017/3/27.
 * javaSE_2
 * 13:58
 * 星期一
 */
public class CastTest {
    public static void main(String[] args) {
        int x = 1;                            //整形 转换 字符串
        Integer integer = x;
        String s1 = integer.toString();
        System.out.println(s1);

        String s3 = "" + x;
        System.out.println(s3);

        String s4 = String.valueOf(x);
        System.out.println(s4);

        String s5 = Integer.toString(x);
        System.out.println(s5);


            //字符串  转换  整形
        String s2 = "123";
        int y = Integer.valueOf(s2);
        System.out.println(y);

        int y1 = Integer.parseInt(s2); //parse  解析
        System.out.println(y1);

    }


}
