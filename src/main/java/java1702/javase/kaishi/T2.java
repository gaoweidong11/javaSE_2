package java1702.javase.kaishi;

/**
 * Created by 高伟冬 on 2017/4/8.
 * javaSE_2
 * 14:17
 * 星期六
 */
public class T2 {
    public static void main(String arg[]) {
        int a[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int n[] = new int[a.length];
        int k = 0;
        for (int anA : a) {
            if (anA != 0) {
                n[k] = anA;
                System.out.print(n[k] + "\t");
                k++;
            }
        }
    }
}
