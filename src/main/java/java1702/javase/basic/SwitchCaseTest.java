package java1702.javase.basic;

import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/3/10.
 */
public class SwitchCaseTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D: ");
        String s = scanner.nextLine();
        System.out.println(s);



        switch (s) {
            case "A" :
                System.out.println("i <= 100");
                break;
            case "B" :
                System.out.println("i <= 90");
                break;
            case "C":
                System.out.println("i <= 80");
                break;
            case "D":
                System.out.println("i <= 60");
                break;
        /*int i = 89;


        if (i >= 90) {
            System.out.println("A");
        } else
        if (i >= 75) {
            System.out.println("B");
        } else
        if (i >= 60) {
            System.out.println("C");
        } else
        if (i < 0) {
            System.out.println("D");
        }*/
        }
    }
}

