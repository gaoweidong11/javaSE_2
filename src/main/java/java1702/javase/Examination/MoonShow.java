package java1702.javase.Examination;
import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/3/23.
 * javaSE_2
 * 13:48
 * 星期四
 */
public class MoonShow {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入年份：");
        int year = input.nextInt();

        System.out.println("输入月份：");
        int month = input.nextInt();

        monthYear(month,year);                         //引用1，
        monthBiao(month,year);                         //引用5，

    }

    //1，建立显示月份、年份。和分隔线。显示星期天到星期六。
    private static void monthYear(int month, int year){
        String [] arr = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
        System.out.println("\t\t"+arr[month-1]+"  "+year+"\n-------------------------------------");
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
    }

    //2，计算输入年份的1月1号距离1800年的1月1号的总天数。
    private static int totalday(int year){
        int totalday = 0;
        for(int x = 1800; x < year; x++){
            if(x % 400 == 0 || (x % 4 == 0 && x % 100 != 0))
                totalday +=366;
            else
                totalday +=365;
        }
        return totalday;
    }

    //3，计算月份的天数。
    private static int monthDays(int month, int year){
        int sum = 0;

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                sum = 31;
                break;
            case 4: case 6: case 9: case 11:
                sum = 30;
                break;
            case 2:
                if(year % 400 == 0 || (year % 4 == 0 && year% 100 != 0))
                    sum = 29;
                else
                    sum = 28;
                break;
        }
        return sum;
    }

    //4，计算输入年份一月一号是星期几。
    private static int weekday(int month, int year){
        int sum = 0;
        for(int a = 1; a< month;a++){
            sum += monthDays(a,year);
        }
        int totalday = sum + totalday( year);
        return (totalday + 3) % 7;
    }

    //5，输出月份天数表格。
    private static void monthBiao(int month, int year){
        for(int a = 1;a<=weekday(month,year);a++){
            System.out.print("     ");
        }
        for(int j = 1;j <=monthDays(month,year) ;j++){
            System.out.printf("1",j);
            if((j+weekday(month,year))%7==0)               //换行规格，逢七就要换行，原来可以这样。
                System.out.println();
        }
    }
}
