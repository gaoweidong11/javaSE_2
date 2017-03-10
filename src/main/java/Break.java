/**
 * Created by 高伟冬 on 2017/3/10.
 */
public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
