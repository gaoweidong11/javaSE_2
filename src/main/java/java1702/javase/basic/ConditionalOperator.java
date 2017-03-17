package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/8.
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = (x > y) ? 1 : 100;//（条件）？（真值）：（假数值）
        System.out.println(z);
    }
}
