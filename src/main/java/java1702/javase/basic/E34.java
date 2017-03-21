package java1702.javase.basic;

import java.util.Random;

/**
 * Created by 高伟冬 on 2017/3/20.
 * javaSE_2
 * 15:56
 * 星期一
 */
//随机生成[1， 20]数10000次，使用两种方法实现（java.lang.Math，java.util.Random），并判断两种方法的效率和分布。
public class E34 {
//    public static void main(String [] args){
//        int ran = (int)(Math.random()*9999 +1);
//        System.out.println(ran);
//    }
//}
public static void main(String[] args) {
    int max=20;
    int min=1;
    Random random = new Random();
    int s = random.nextInt(max)%(max-min+1) + min;
    System.out.println(s);
}
}


