package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/17.
 */
public class Oop1 {
    public static boolean isLeapYear(int year)
    {
        if(year % 4 == 0 && year % 100 != 0)
            return true;
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(isLeapYear(2017));
    }
}
