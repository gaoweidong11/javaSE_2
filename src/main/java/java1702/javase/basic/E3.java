package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/8.
 * javaSE_2
 * 8:35
 * 星期二
 */
public class E3 {
    public static void main(String[] args)
    {
        for(int i = 1000; i < 10000; i++) {
            int  g, s, b,q;//g各位，s十位，b百位,q千位。

            q = i / 1000;

            b = i / 100 % 10;

            s  = i / 10 % 10;

            g = i % 10;

            if(i == g * g * g * g + s * s * s * s + b * b * b * b + q * q * q * q) {

                System.out.println(i);
            }
        }
    }
}

