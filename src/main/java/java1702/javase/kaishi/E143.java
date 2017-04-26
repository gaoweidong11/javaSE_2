package java1702.javase.kaishi;

import java.io.*;

/**
 * Created by 高伟冬 on 2017/4/22.
 * javaSE_2
 * 9:08
 * 星期六
 */
//编写一个程序,其功能是将两个文件的内容合并到一个文件中
//例如：1.txt 内容为 abc；2.txt 内容为 def；生成新文件3.txt 内容为 abcdef
public class E143 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src/main/java/java1702/javase/kaishi/abc.java");
        File file2 = new File("src/main/java/java1702/javase/kaishi/efg.java");
        FileInputStream fis = new FileInputStream(file2);
        InputStreamReader isr = new InputStreamReader(fis);
        FileOutputStream fos = new FileOutputStream(file1, true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        int c;
        while ((c = isr.read()) != -1) {
            osw.write((char) c);
        }
        isr.close();
        osw.close();
    }
}

