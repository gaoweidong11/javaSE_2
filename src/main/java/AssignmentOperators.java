/**
 * Created by 高伟冬 on 2017/3/8.
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int i = 0;//shift+f6
        i += 1;//等价于 i = i + 1
        i -= 2;//i = i - 1
        i *= 3;//i = i * 1
        i /= 4;//i = i / 1
        i %= 5; // i = i % 1
        System.out.println(i);

        boolean b = true;
        b &= false;                //针对布尔值或定点类型值
        System.out.println(b);


    }
}
