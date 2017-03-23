package java1702.javase.basic;

import java.util.*;


/**
 * Created by 高伟冬 on 2017/3/23.
 * javaSE_2
 * 15:34
 * 星期四
 */
public class EEE1 {
    public static void main(String [] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        while (calendar.get(Calendar.YEAR) == year) {
            int wday = calendar.get(Calendar.DAY_OF_WEEK);
            int mday = calendar.get(Calendar.DAY_OF_MONTH);
            if (mday == 1) {
                System.out.println("\n日\t一\t二\t三\t四\t五\t六\t第" + (calendar.get(Calendar.MONTH) + 1) + "月");
                System.out.println("----------------------------------");
                for (int i = 0; i < wday - 1; i++) {
                    System.out.print("\t");
                }
            }
                System.out.print(mday + "\t");
                if (wday == 7) System.out.println();
                calendar.add(Calendar.DAY_OF_YEAR,1);
            }
        }

    }

