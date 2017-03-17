package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/16.
 */
//	定义一个判断闰年的方法，在	main	方法中调用该方法判断输入的一个年份是 否是闰年
public class Oop1 {
    public boolean isLeaopYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Oop1 oop1= new Oop1();
        if (oop1.isLeaopYear(2017)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
