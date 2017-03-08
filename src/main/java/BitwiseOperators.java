/**
 * Created by 高伟冬 on 2017/3/7.
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        // Bit 位\ [bɪt] 比特 Byte 字节\ [baɪt] 1 Byte = 8 Bit
        // 1KB = 1024 Byte MB = 1024KB GB TB PB
        // 00000000
        // 2^31 - 1  -2^31

        int x = 1;
        int y = 1;

        System.out.println(x >>> y); // 按位与 按位左移


                int x1 = 1; // integer
                int y1 = 2;
                int z = 5 / 7;

                double d1 = 1;
                double d2 = 2;

                System.out.println(z);

                System.out.println(d1 / d2);

                System.out.println(x1 / d2);

                System.out.println(d1 / y1);

                String s1 = "hi";
                String s2 = "hello";

                System.out.println(x + y + s1 + d1);

                int i = 1;
                // i-- i = i - 1;

                System.out.println(i--); // i++  ++i
                System.out.println(i);

                int m = -1000;
                int n = -300;

                // 判断整除
                System.out.println(m % n); // 求余

                // 3 billion devices use Java    30亿设备使用java

    }
}
