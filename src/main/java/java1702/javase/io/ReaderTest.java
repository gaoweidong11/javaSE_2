package java1702.javase.io;

import java.io.*;

/**
 * Created by 高伟冬 on 2017/4/20.
 * javaSE_2
 * 9:03
 * 星期四
 */
public class ReaderTest {
    public static void main(String[] args) {

        try (Reader reader = new FileReader("test");) {

            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

