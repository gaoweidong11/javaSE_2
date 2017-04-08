package java1702.javase.newoop;

/**
 * Created by 高伟冬 on 2017/4/8.
 * javaSE_2
 * 8:52
 * 星期六
 */
public class StringBufferDome {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(5, 6));
        System.out.println(stringBuffer.insert(5, ","));
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.reverse().insert(stringBuffer.length(), '!'));
        stringBuffer.setCharAt(0, 'H');
        System.out.println(stringBuffer);
    }
}
