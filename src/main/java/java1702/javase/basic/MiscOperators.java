package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/8.
 */
public class MiscOperators {
    public static void main(String[] args) {
        int i = 97;
        char c = (char) i;

        // char [0, 65535]
        // int [-21..亿, 21...亿]

        System.out.println((int) c);

        int x = (1 + 2 - 3 * 4 / 5 % 6) << 7; // 代码可读性增强 （）
        System.out.println(x);
    }
}
