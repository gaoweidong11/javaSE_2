package java1702.javase.io;

import java.io.*;

/**
 * Created by 高伟冬 on 2017/4/18.
 * javaSE_2
 * 10:38
 * 星期二
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("test");
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
