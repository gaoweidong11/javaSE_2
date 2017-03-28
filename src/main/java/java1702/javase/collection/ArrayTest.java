package java1702.javase.collection;
/**
 * Created by 高伟冬 on 2017/3/27.
 * javaSE_2
 * 15:34
 * 星期一
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strings = {"1","2","4","5","6","7"};
        for (String string : strings) {
            System.out.println(string);
        }

        ArrayTest[] arrayTests = new ArrayTest[3];
        System.out.println(arrayTests[2]);

        double[] doubles = new double[100];
            System.out.println(doubles[2]);

        int[] ints = new int[200];
        System.out.println(ints[2]);

       ArrayTest[] arrayTests1 = new ArrayTest[2];
        System.out.println(arrayTests1[0]);

    }
}
