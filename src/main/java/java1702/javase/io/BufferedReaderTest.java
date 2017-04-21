package java1702.javase.io;

import java.io.*;

/**
 * Created by 高伟冬 on 2017/4/21.
 * javaSE_2
 * 9:49
 * 星期五
 */
public class BufferedReaderTest {
    private static final String FILE = "src/main/java/java1702/javase/io/BufferedReaderTest.java";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
