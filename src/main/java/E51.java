/**
 * Created by 高伟冬 on 2017/3/8.
 */
public class E51 {
    public static void main(String args[]){
        int nums = fibonacci(35);
        System.out.println(nums);
    }
    private static int fibonacci(int n){
        if(n<=1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

