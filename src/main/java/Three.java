/**
 * Created by 高伟冬 on 2017/3/8.
 */
public class Three {
    public static void main(String[] args)
    {
        for(int i=100;i<=999;i++) {
            int  a, b, c;

            c =i / 100;

            b =( i - c * 100) / 10;

            a = i - c * 100 - b * 10;

            if(i == a * a * a + b * b * b + c * c * c) {

                System.out.println(i);
            }
        }
    }
}

