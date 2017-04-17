package java1702.javase.kaishi;

import java.util.*;

/**
 * Created by 高伟冬 on 2017/4/15.
 * javaSE_2
 * 8:47
 * 星期六
 */
//写出一个程序，接受一个浮点数值，输出该数值的近似整数值。
// 如果小数点后数值大于等于5,向上取整；小于5，则向下取整
//例如：
//    -4.5 四舍五入的结果是-4
//    4.4 四舍五入的结果是4
public class E120 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入浮点数值：");
        while (scan.hasNext()) {
            double num = scan.nextDouble();
            int i = (int) num;

            System.out.println((num - i) >= 0.5 ? i + 1 : i);
        }
    }
}


