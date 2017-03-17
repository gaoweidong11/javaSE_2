package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/16.
 */
public class E21 {
    public static void main(String[] args){

        System.out.println("1!+2!+3!+……+20!="+getSum(20));

    }

    public static long getSum(int n){

        long i,k,fac,sum=0;

        for(i=1;i<=n;i++){

            fac=1;

            for(k=1;k<=i;k++)

                fac=fac*k;

            sum=sum+fac;

        }

        return sum;

    }
}
