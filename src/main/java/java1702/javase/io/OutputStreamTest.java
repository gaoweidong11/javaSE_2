package java1702.javase.io;

import java.io.*;

/**
 * Created by 高伟冬 on 2017/4/20.
 * javaSE_2
 * 9:02
 * 星期四
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("new");
            outputStream.write(97);
            outputStream.flush(); //
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
