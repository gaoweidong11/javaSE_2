package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/8.
 */
public class IfTest {
    public static void main(String[] args) {
                int grade = 1000; // n.\ 年级；等级；成绩；级别；阶段
                if (grade >= 90) {
                    System.out.println("优秀。");
                    } else
                        if (grade >= 75) {
                    System.out.println("良好。");
                    } else
                        if (grade >= 60) {
                    System.out.println("及格。");
                     } else
                    System.out.println("不及格。");
           }
 }
