package java1702.javase.kaishi;

/**
 * Created by 高伟冬 on 2017/5/6.
 * javaSE_2
 * 14:52
 * 星期六
 */
//编写一个实现方法重载的程序
public class E162 {
    private int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        int intMax = max(a, b);
        intMax = max(intMax, c);
        return intMax;
    }

    public static void main(String[] args) {
        E161 e161 = new E161();
//        System.out.println(e161.max(2, 2));
//        System.out.println(e161.max(2, 6, 5));
    }
}

