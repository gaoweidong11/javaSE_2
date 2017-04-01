package java1702.javase.newoop;

/**
 * Created by 高伟冬 on 2017/4/1.
 * javaSE_2
 * 14:14
 * 星期六
 */
public class E4 {
    public static void main(String[] args) {

        int[] a = {89,90,77,87,66,54,328,890,99};
        int[] b = {65,72,12,77,2,96,54,27,89};
        int[] c = new int[a.length + b.length];
        int count = 0;
        int flag;

        for (int i = 0; i < a.length; i++) {
            flag = 0;
            for (int aB : b) {
                if (a[i] == aB) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                c[count] = a[i];
                count++;

            }
        }

        for (int aB : b) {
            flag = 0;
            for (int anA : a) {
                if (aB == anA) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                c[count] = aB;
                count++;
            }
        }
        for (int i = 0; i < count; i++)
            System.out.print(c[i] + " ");

    }
}
