package java1702.javase.kaishi;

import java.io.*;

/**
 * Created by 高伟冬 on 2017/4/22.
 * javaSE_2
 * 9:08
 * 星期六
 */
//编写一个程序实现以下功能:
//(1)产生5000个1~9999之间的随机整数,将其存入文本文件a.txt中
//(2)从文件中读取这5000个整数,并计算其最大值、最小值和平均值并输出结果。
public class E144 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        String tempStr = "";
        for (int i = 0; i < 5000; i++) {
            double a = Math.random() * 9999;//random  随机
            int aa = (int) a + 1;
            tempStr += aa + "\r\n";
        }
        outputData(tempStr);
        test1();
    }

    private static void outputData(String text) {
        try {
            BufferedWriter rw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("a.txt"), "UTF-8"));
            rw.write(text);
            rw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test1() {
        String s;
        int leng = 0;
        int test[] = new int[5000];
        try {
            BufferedReader input = new BufferedReader(new FileReader("a.txt"));
            while ((s = input.readLine()) != null && leng < 5000) {
                test[leng] = Integer.parseInt(s);
                leng++;
            }
            input.close();
            int max = test[0];
            int min = test[0];
            int sum = 0;
            for (int i = 0; i < 5000; i++) {
                if (test[i] < min)
                    min = test[i];
                if (test[i] > max)
                    max = test[i];
                sum += test[i];
            }
            System.out.println("max=" + max);
            System.out.println("min=" + min);
            System.out.println("avg=" + (double) sum / 5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
