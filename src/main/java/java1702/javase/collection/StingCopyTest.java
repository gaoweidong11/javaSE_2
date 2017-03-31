package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by 高伟冬 on 2017/3/31.
 * javaSE_2
 * 9:49
 * 星期五
 */
public class StingCopyTest {
    public static void main(String[] args) {
        int[] srcArray = {1, 2, 3, 4, 5, 6};
        int[] destArray = new int[10];

        // src - source 源\ [sɔːs]
        // dest - destination 目的地\ [,destɪ'neɪʃ\(ə\)n]
        System.out.println(Arrays.toString(destArray));
        System.arraycopy(srcArray, 1, destArray, 6, 4);
        System.out.println(Arrays.toString(destArray));

    }
}

