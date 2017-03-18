package java1702.javase.Examination;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/3/18.
 */
public class Fourth {
    public static void main(String[] args) {
        System.out.println("请输入摄氏温度：");

        Scanner scanner = new Scanner(System.in);
        double C = scanner.nextDouble();
        double F = (9 / 5) * C + 32;
        System.out.println("华氏温度F的值为" + String.format("%.2f",F));
    }
}
