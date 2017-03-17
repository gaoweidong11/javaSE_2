package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/8.
 */

//	判断101-200之间有多少个素数，并输出所有素数。
// 素数：只能被1和它本身整 除的正整数（1不是素数）
public class E2 {
    public static void main(String[] args) {
        int i, j;
        for ( i = 101; i <= 200; i++) {        //101-200

            for ( j = 2; j < i; j++) {         //2-200

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
