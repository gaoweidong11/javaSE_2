package java1702.javase.kaishi;

import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/4/8.
 * javaSE_2
 * 14:23
 * 星期六
 */
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//用户输入语句
        System.out.print("输入一个字符串：");
        String strings = scanner.nextLine();//nextLine  下一行（赋值）
        byte[] bytes = strings.getBytes();
        int j = 0;
        for (byte aByte : bytes) {
            j += aByte;
        }
        System.out.println(j);
        System.out.println("输入一个整数：");
        int k =scanner.nextInt();
        System.out.println(k);
    }
}

