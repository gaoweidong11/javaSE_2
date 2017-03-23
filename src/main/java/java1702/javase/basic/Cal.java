package java1702.javase.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class Cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年月：(格式：2011-03)");
        String str = input.next();
        Calendar cal = getCalendar(str);
        print(cal);
    }


    private static Calendar getCalendar(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一周的第一天为星期一
        try {
            cal.setTime(sdf.parse(str));
        } catch (ParseException e) {
            System.out.println("输入的日期格式有问题，请输入年月：(2010-01)");
        }
        return cal;
    }

    /**
     * 得到这个月有多少天，考虑闰年的问题
     * @param date
     */
    private static int getDays(Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;

        int days = 0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    days = 29;
                else
                    days = 28;
                break;
        }

        return days;
    }

    private static void print(Calendar cal) {
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        int i = 0;
        int space = cal.get(Calendar.DAY_OF_WEEK) - 1;
        for(; i<space; i++) {
            System.out.print("       ");
        }
        int day = cal.get(Calendar.DAY_OF_MONTH);
        for(; i<getDays(cal) + space; i++) {
            System.out.format("%2d      ", day++);
            if((i + 1) % 7 == 0)
                System.out.println();
        }
    }
}