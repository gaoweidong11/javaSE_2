package java1702.javase.collection;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/3/28.
 * javaSE_2
 * 10:19
 * 星期二
 */
public class Hello {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        Random random = new Random();
        int n = scnner.nextInt();
        int[][] a = new int[10][10];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                a[i][j] = random.nextInt(n);//随机产生0~n-1的随机数
            }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
