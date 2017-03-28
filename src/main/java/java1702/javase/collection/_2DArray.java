package java1702.javase.collection;

/**
 * Created by 高伟冬 on 2017/3/28.
 * javaSE_2
 * 9:11
 * 星期二
 */
public class _2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[3][5];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i + j;
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
