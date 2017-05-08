package java1702.javase.multithreading;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * Created by 高伟冬 on 2017/5/8.
 * javaSE_2
 * 11:11
 * 星期一
 */
class StreamTools {
    static byte[] isToData(InputStream is) throws IOException{
        // 字节输出流
        ByteArrayOutputStream bops = new ByteArrayOutputStream();
        // 读取数据的缓存区
        byte buffer[] = new byte[1024];
        // 读取长度的记录
        int len = 0;
        // 循环读取
        while ((len = is.read(buffer)) != -1) {
            bops.write(buffer, 0, len);
        }
        // 把读取的内容转换成byte数组
        byte data[] = bops.toByteArray();
        bops.flush();
        bops.close();
        is.close();
        return data;
    }
}
