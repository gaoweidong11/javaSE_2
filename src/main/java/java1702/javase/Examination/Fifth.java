package java1702.javase.Examination;

import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/3/18.
 */
public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double v = 4.0 / 3.0  *  3.14  *  r * r * r;
        System.out.println(v);
    }
}
