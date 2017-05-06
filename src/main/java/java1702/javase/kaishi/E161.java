package java1702.javase.kaishi;

import java.io.*;

/**
 * Created by 高伟冬 on 2017/5/6.
 * javaSE_2
 * 14:45
 * 星期六
 */
public class E161 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int score;
        int k;
        score = Integer.parseInt(br.readLine());
        if (score > 100 || score < 0) {
            System.out.println("输入成绩超出范围！");
            System.exit(1);
        }
        k = score / 10;
        switch (k) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}