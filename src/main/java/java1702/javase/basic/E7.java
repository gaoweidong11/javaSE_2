package java1702.javase.basic;

import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/3/29.
 * javaSE_2
 * 16:59
 * 星期三
 */
//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。

public class E7 {
    public static void main(String[] args) {
        int abcCount = 0;//英文字母个数
        int spaceCount = 0;//空格键个数
        int numCount = 0;//数字个数
        int otherCount = 0;//其他字符个数
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        for (char aCh : ch) {
            if (Character.isLetter(aCh)) {
                //判断是否字母
                abcCount++;
            } else if (Character.isDigit(aCh)) {
                //判断是否数字
                numCount++;
            } else if (Character.isSpaceChar(aCh)) {
                //判断是否空格键
                spaceCount++;
            } else {
                //以上都不是则认为是其他字符
                otherCount++;
            }
        }
        System.out.println("字母个数：" + abcCount);
        System.out.println("数字个数：" + numCount);
        System.out.println("空格个数：" + spaceCount);
        System.out.println("其他字符个数：" + otherCount);
    }
}
