/**
 * Created by 高伟冬 on 2017/3/8.
 */
public class E4 {
    public static void main(String[] args) {
        int i = 90;                         //还需加深了解
        int k = 2;
        System.out.print(i + "=");
        while (i > k) {
            if (i % k == 0) {
                System.out.print(k + "*");
                i = i / k;
            }
            if (i % k != 0) {
                k++;
            }
        }
        System.out.println(k);
    }
}