package java1702.javase.realEstate;

/**
 * Created by 高伟冬 on 2017/5/11.
 * javaSE_2
 * 16:54
 * 星期四
 */
public class Dome {
    public static void main(String[] args){
        int[] is={};
        int max = is[0];
        int min = is[0];
        int sum = 0;
        double ave = 0.0;
        for (int i1 : is) {
            if (i1 > max) {
                max = i1;
            }
            if (i1 < min) {
                min = i1;
            }
            sum += i1;
        }
        ave = sum*1.0/is.length;
        System.out.println("最小是："+min);
        System.out.println("最大是："+max);
        System.out.println("平均值是："+ave);
    }
}
