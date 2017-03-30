package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/30.
 * javaSE_2
 * 9:53
 * 星期四
 */
public class E33Test {
    public static void main(String[] args) {
        int[][] a = new int[20][20];//定义一个a[][]数组
        for (int i = 0; i < 10; i++) {
            a[i][i] = 1;//给边界赋值1
            a[i][0] = 1;
        }
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];    //此处for循环给中心值赋值
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 2 * (10 - i) - 1; k++) {
                System.out.print(" ");           //此处for循环给将三角形以外空格显示出来
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + "   ");    //此处for循环给将杨辉三角形内部数字以及空格显示出来
            }
            System.out.println();
        }
    }
}
