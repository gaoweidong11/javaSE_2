package java1702.javase.newoop;

/**
 * Created by 高伟冬 on 2017/4/5.
 * javaSE_2
 * 14:57
 * 星期三
 */
public class OverloadTest {

    public void method(int j, String i) {
        System.out.println("method...");
    }

    public int method(String s, int i) {
        System.out.println("");
        return i;
    }

    public static void main(String[] args) {
        OverloadTest overloadTest = new OverloadTest();
        overloadTest.method(0, "");
    }
}