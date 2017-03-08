/**
 * Created by 高伟冬 on 2017/3/8.
 */
public class FiftyOne {
    public static void main(String args[]){
        int nums = fibonacci(8);
        System.out.println(nums);
    }
//网上 推荐  暂时不会
    static int fibonacci(int n){
        if(n<=1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

