package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/17.
 */
public class E9 {
    public static void main(String[] args) {
        int a, b, sum;
        sum = 0;
        for (a = 1; a <= 1000; a++) {
            for (b = 1; b < a; b++) {
                if (a % b == 0) {
                    // 此处用sum去累加了 如  sum =1 ,b =2,   则sum = 1 + 2;
                    sum = sum + b;
                }
            }
            if (sum == a) {
                System.out.println(sum);
            }
            // 如果这里不重置清零，则上方sum = sum + b; 这行语句会将上一次值累加上去，就不是我们想要的值了
            sum = 0;
        }
    }
}

