package java1702.javase.io;
import java.io.*;
/**
 * Created by 高伟冬 on 2017/4/21.
 * javaSE_2
 * 10:19
 * 星期五
 */
public class BufferedTest {
    public static void main(String[] args) {
        // buffer 缓冲\ ['bʌfə]
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(""));//写文件路径
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(""))//复写上文件给出新的文件名
        ) {
            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}