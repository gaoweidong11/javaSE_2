package java1702.javase.multitherading;

/**
 * Created by 高伟冬 on 2017/5/10.
 * javaSE_2
 * 15:06
 * 星期三
 */
public class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }

    public void withdraw(int money) {
        if (this.money - money < 0) {
            System.out.println("Not enough...");
            return;
        }
        this.money -= money;
    }

    public int getMoney() {
        return money;
    }
}

class AccountTest implements Runnable {
    private Account account;

    @Override
    public void run() {
        account.withdraw(1000);
    }

    public static void main(String[] args) {

    }
}
