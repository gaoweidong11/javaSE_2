/**
 * Created by 高伟冬 on 2017/3/8.
 */
public class Two {
    public static void main(String[] args) {
        int i, j;
        for (i = 101; i <= 200; i++) {//101-200

            for (j = 2; j < i; j++) {//2-200

                if (i % j == 0) {

                 break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }

        }

    }

}