package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/15.
 */
public class E52 {
    /**
     *
     * @param n 盘子的数目
     * @param origin 源座 -
     * @param assist 辅助座
     * @param destination 目的座
     */
    public void e52(int n, char origin, char assist, char destination) {
        if (n == 1) {
            move(origin, destination);
        } else {
            e52(n - 1, origin, destination, assist);
            move(origin, destination);
           e52(n - 1, assist, origin, destination);
        }
    }

    // 打印运动路线
    private void move(char origin, char destination) {
        System.out.println("Direction:" + origin + "--->" + destination);
    }

    public static void main(String[] args) {
       E52 hanoi = new E52();
        hanoi.e52(3, 'A', 'B', 'C');
    }
}

