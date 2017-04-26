package java1702.javase.kaishi;

import javax.sound.midi.Soundbank;

/**
 * Created by 高伟冬 on 2017/4/22.
 * javaSE_2
 * 9:08
 * 星期六
 */
//编写一个正确处理的产生空指针异常的程序
public class E142 {
    public static void main(String[] args) {
        try {
            ((String) null).length();
        } catch (NullPointerException e) {
            System.err.println("空指针异常！");
        }
    }
}
