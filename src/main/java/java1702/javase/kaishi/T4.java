package java1702.javase.kaishi;

/**
 * Created by 高伟冬 on 2017/4/8.
 * javaSE_2
 * 14:56
 * 星期六
 */
//有工人,农民,教师,科学家,服务生,其中,工人,农民,
// 服务生只有基本工资.教师除基本工资外,还有课酬(元/天),
// 科学家除基本工资外,还有年终奖,请你写出相关类,
// 并编写测试类将各种类型的员工的全年工资打印出来。
public class T4 {
    private String name;
    private int pay;

    T4(String name, int pay) {
        this.name = name;
        this.pay = pay;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}

// 科学家
class Scientist extends T4 {
    private int endPay;

    Scientist(String name, int pay, int endPay) {
        super(name, pay);
        this.endPay = endPay;
    }

    int getEndPay() {
        return endPay;
    }

    public void setEndPay(int endPay) {
        this.endPay = endPay;
    }
}

/**
 * 教师
 */
class Teacher extends T4 {
    private int oneDayPay;

    Teacher(String name, int pay, int oneDayPay) {
        super(name, pay);
        this.oneDayPay = oneDayPay;
    }

    int getOneDayPay() {
        return oneDayPay;
    }

    public void setOneDayPay(int oneDayPay) {
        this.oneDayPay = oneDayPay;
    }

}

/*
 * 其他人
 */
class OtherPerson extends T4 {
    private String a;

    OtherPerson(String name, int pay) {
        super(name, pay);
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}

class Test {
    public static void main(String[] args) {
        Scientist s1 = new Scientist("科学家", 10000, 10);
        Teacher teacher = new Teacher("教师", 2000, 10);
        OtherPerson op = new OtherPerson("工人", 2000);
        new Test().printScientist(s1);
        new Test().printTeacher(teacher);
        new Test().printOther(op);
    }

    private void printScientist(Scientist scientist) {
        System.out.println(scientist.getName() + "一年的工资是:" + (scientist.getPay() * 12 + scientist.getEndPay()));
    }

    private void printTeacher(Teacher t) {
        System.out.println(t.getName() + "一年的工资是：" + (t.getOneDayPay() * 365 + t.getPay() * 12));
    }

    private void printOther(OtherPerson op) {
        System.out.println(op.getName() + "一年的工资是：" + (op.getPay() * 12));
    }
}

