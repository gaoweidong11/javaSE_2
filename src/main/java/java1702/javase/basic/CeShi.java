package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/10.
 */
public class CeShi {
    public static void main(String[] args) {
        for (int i = 100; i < 200; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (j % i == 0) {

                    b = false;
                }
            }
            if (b) {
                System.out.println(i);
             }
        }
    }
}
