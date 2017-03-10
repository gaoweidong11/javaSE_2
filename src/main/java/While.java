/**
 * Created by 高伟冬 on 2017/3/10.
 */
public class While {
    public static void main(String[] args) {
        int i = 10;
        while (i < 20)//虽然  while
        {
            System.out.println(i);
            i++;
        }
        System.out.println("---------------------------");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }while (j > 10);
        System.out.println("-----------------------------");
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }

    }
}

