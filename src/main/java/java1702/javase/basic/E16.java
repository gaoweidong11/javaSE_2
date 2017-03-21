package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/21.
 * javaSE_2
 * 14:47
 * 星期二
 */
//	输出9*9口诀。
public class E16 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i < 10; i++) {
            for (j = 1; j <= i ; j++) {
                System.out.println(j + "*" + i + "=" + j * i );
            }
        }
    }
}
