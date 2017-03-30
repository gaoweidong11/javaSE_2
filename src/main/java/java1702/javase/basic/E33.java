package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/29.
 * javaSE_2
 * 17:03
 * 星期三
 *
 *
 * 打印出杨辉三角形（要求打印出10行如下图）
 1
 1 2 1
 1 3 3 1
 .........（略）
 */
public class E33 {
    public static void main(String args[]) {
        int r = 30;
        int a[][] = new int[r + 1][];
        for (int i = 0; i <= r; i++) {
            a[i] = new int[i + 1];
        }
        yanghui(a, r);
    }
    private static void yanghui(int a[][], int r) {
        for (int i = 0; i <= r; i++)
            for (int j = 0; j <= a[i].length - 1; j++) {
                if (i == 0 || j == 0 || j == a[i].length - 1)
                    a[i][j] = 1;
                else
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= a[i].length - 1; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}

