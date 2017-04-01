package java1702.javase.newoop;

import java.io.*;


/**
 * Created by 高伟冬 on 2017/4/1.
 * javaSE_2
 * 14:04
 * 星期六
 */
public class E2 {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        StringBuffer strb = new StringBuffer(br.readLine());
        int i;
        for (i = 0; i < strb.length(); i++) {
            char ch = strb.charAt(i);
            if (ch <= 'Z' && ch >= 'A')
                strb.setCharAt(i, (char) (ch + 32));
            if (ch <= 'z' && ch >= 'a')
                strb.setCharAt(i, (char) (ch - 32));
        }
        strb.reverse();
        System.out.println(strb);
    }
}
