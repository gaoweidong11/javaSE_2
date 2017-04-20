package java1702.javase.io;
import java.io.*;
/**
 * Created by 高伟冬 on 2017/4/20.
 * javaSE_2
 * 9:04
 * 星期四
 */
public class WriterTest {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("new");
//            writer.write(Integer.parseInt("4e00", 16));
            writer.write(0x4e01);
            // 0b1111_1111_0000 b binary 二进制
            // 0111 八进制
            // 0x11
            System.out.println(011);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}