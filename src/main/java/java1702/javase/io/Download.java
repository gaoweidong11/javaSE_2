package java1702.javase.io;

import java.io.*;
import java.net.*;

/**
 * Created by 高伟冬 on 2017/4/21.
 * javaSE_2
 * 10:24
 * 星期五
 */
public class Download {
    private static final String IMAGE_URL = "";//文件地址

    public static void main(String[] args) {
        try {
            URL url = new URL(IMAGE_URL);
            try (
                    InputStream inputStream = url.openStream();
                    OutputStream outputStream = new FileOutputStream("")//读出
            ) {
                System.out.println(inputStream.available());
                int i;
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}