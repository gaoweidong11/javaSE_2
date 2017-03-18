package java1702.javase.Examination;

/**
 * Created by 高伟冬 on 2017/3/18.
 */
public class Third {
    public static boolean isValidate(int a,int b,int c) {
        boolean flag = false;
        if ((a < b + c) && (a > Math.abs(b - c))) {
            flag = true;
        } else {

        }
        return flag;
    }

    public static void main(String[] args) {
        int a = (int)Math.random();
        int b = (int)Math.random();
        int c = (int)Math.random();
        if (isValidate(a, b, c)) {
            int s = 0 ;
            s = (int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(s);
        }
    }
}
