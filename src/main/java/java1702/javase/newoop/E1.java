package java1702.javase.newoop;

import java.io.*;

/**
 * Created by 高伟冬 on 2017/4/1.
 * javaSE_2
 * 13:47
 * 星期六
 */
public class E1 {
    public static void main(String[] args) throws IOException {
        final int M = 4;

        double[][] a = new double[M][M];

        int i, j;

        double main_product = 1.0, vice_product = 1.0;

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        for (i = 0; i < M; i++)
            for (j = 0; j < M; j++)
                a[i][j] = Double.parseDouble(br.readLine());
        for (i = 0; i < M; i++) {
            main_product *= a[i][i];
            vice_product *= a[i][M - i - 1];
        }
        System.out.println("主对角线乘积：" + main_product);
        System.out.println("付对角线乘积：" + vice_product);
    }
}



