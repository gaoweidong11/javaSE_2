package java1702.javase.generic;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/4/18.
 * javaSE_2
 * 9:12
 * 星期二
 */
public class CheckedExceptionTest {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("input a file name:");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
//受检异常是程序员出的错  bug   非受检异常 是程序的错误 不受程序员控制的错误
        try {
            RandomAccessFile randomAccessFile =new RandomAccessFile(filename,"r");
        } catch (FileNotFoundException e) {
//e.printStackTrace();
            System.err.println("file not found!");
            test();  //递归调用      ？
        }
    }
}
