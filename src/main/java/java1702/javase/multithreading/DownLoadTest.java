package java1702.javase.multithreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 高伟冬 on 2017/5/8.
 * javaSE_2
 * 11:01
 * 星期一
 */
//瞎搞    网上摘取    等学  数据库  回头看
public class DownLoadTest {
    // 线程的数量
    static int threadNum = 3;
    static int threadCount;// 数量

    private void testDown() {
        try {
            // 创建出URL对象
            String path = "http://localhost:8080/doudou/youdao.exe";
            URL url = new URL(path);
            // 创建出 HttpURLConnection对象
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            // 设置 发请求发送的方式
            httpURLConnection.setRequestMethod("GET");
            // 设置请求是否超时时间
            httpURLConnection.setConnectTimeout(5000);
            // 设置
            httpURLConnection.setRequestProperty("User-Agent", " Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Trident/6.0)");
            // 是否响应成功
            if (httpURLConnection.getResponseCode() == 200) {
                // 获取文件的大小
                int size = httpURLConnection.getContentLength();
                System.out.println("文件的大小" + size);
                // 创建文件
                File file = new File("youdao.exe");
                RandomAccessFile accessFile = new RandomAccessFile(file, "rwd");
                // 设置文件的大小
                accessFile.setLength(size);
                // 每个线程下载的大小
                int blockSize = size / threadNum;
                // 开三个线程 操作此文件
                for (int i = 1; i <= threadNum; i++) {
                    // 1 2 3
                    // 计算出每个线程开始的位置
                    int startSize = (i - 1) * blockSize;
                    // 结束位置
                    int endSize = (i) * blockSize;
                    // 当线程是最后一个线程的时候
                    if (i == threadNum) {
                        // 判断文件的大小是否大于计算出来的结束位置
                        if (size > endSize) {
                            // 结束位置 等于 文件的大小
                            endSize = size;
                        }
                    }
                    // 为每个线程创建一个随机的读取
                    RandomAccessFile threadAccessFile = new RandomAccessFile(file, "rwd");
                    new Thread(new DownLoadThread(i, threadAccessFile, startSize, endSize, path)).start();
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DownLoadTest downLoadTest = new DownLoadTest();
        // 调用下载方法
        downLoadTest.testDown();
    }
}

class DownLoadThread implements Runnable {
    // 下载文件的封装
    private RandomAccessFile accessFile; // 每个线程 都拥有一个accessFile的文件对象 线程1 线程2 线程3
    // 线程下载文件的起始位置
    private int startSize;
    private int endSize;
    // 文件下载的path路径
    private String path;
    private int threadId; // 线程的标识

    DownLoadThread(int threadId, RandomAccessFile accessFile, int startSize, int endSize, String path) {
        this.threadId = threadId;
        this.accessFile = accessFile;
        this.startSize = startSize;
        this.endSize = endSize;
        this.path = path;
    }

    @Override
    public void run() {
        // 执行run方法
        try {
            // 创建文件
            File threadFile = new File(threadId + ".txt");
            if (threadFile.exists()) {
                // 读取该文件的内容
                // 创建文件的输入流对象
                FileInputStream fis = new FileInputStream(threadFile);
                // 采用工具类读取
                byte data[] = StreamTools.isToData(fis);
                // 转化成字符串
                String threadLen = new String(data);
                if (!"".equals(threadLen)) {
                    startSize = Integer.valueOf(threadLen);
                    // 解决 416bug的错误
                    if (startSize > endSize) {
                        startSize = endSize - 1;
                    }
                }
            }
            // 创建URL对象
            URL url = new URL(path);
            // 创建HttpURLConnection对象
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            // 设置请求的头
            httpURLConnection.setRequestMethod("GET");
            // 设置请求是否超时时间
            httpURLConnection.setConnectTimeout(5000);
            // 设置
            httpURLConnection.setRequestProperty("User-Agent", " Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Trident/6.0)");
            // 关键的设置
            httpURLConnection.setRequestProperty("Range", "bytes=" + startSize + "-" + endSize);
            // 输出当前线程
            System.out.println("当前线程" + threadId + " 下载开始位置:" + startSize + " 下载结束位置:" + endSize);
            // 响应成功
            // 设置随机读取文件的 开始位置
            accessFile.seek(startSize);
            // 获取相应流对象
            InputStream is = httpURLConnection.getInputStream();
            // 创建输出流对象
            byte buffer[] = new byte[1024];
            int len = 0;
            int threadTotal = 0;// 每个线程下载后保存记录 /
            while ((len = is.read(buffer)) != -1) {
                accessFile.write(buffer, 0, len);
                threadTotal += len;// 记录你写入的长度 //xml文件
                // 通过文件记录文件下载的长度
                FileOutputStream fos = new FileOutputStream(threadFile);
                fos.write((threadTotal + "").getBytes());
                fos.flush();
                fos.close();
            }
            accessFile.close();
            is.close();
            System.out.println(threadId + "线程执行完毕");
            //线程操作
            synchronized (DownLoadTest.class) {
                DownLoadTest.threadCount++;
                if (DownLoadTest.threadCount >= DownLoadTest.threadNum) {
                    for (int i = 1; i <= DownLoadTest.threadNum; i++) {
                        File file = new File(i + ".txt");
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
