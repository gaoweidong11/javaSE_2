/**
 * Created by 高伟冬 on 2017/3/7.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        System.out.println(a ^ b);

        // & ab 都为 true  结果为 true
        // | ab 都为 false 结果为 false
        // ^ ab 不相同 结果为 true （异） 相同  结果为false
        //！ 取反

        int x = 1;
        int y = 2;

        boolean z = (x < y) && (y++ > x);

        System.out.println(z);
        System.out.println(y);
    }
}
