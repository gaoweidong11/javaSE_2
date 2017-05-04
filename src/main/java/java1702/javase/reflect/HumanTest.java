package java1702.javase.reflect;

/**
 * Created by 高伟冬 on 2017/5/3.
 * javaSE_2
 * 17:29
 * 星期三
 */
class Animals {
    public int age;
    private double weight;
    public Animals() {

    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int sleep(int houre) {
        return houre;
    }

    public void eat(String food) {
        System.out.println("eating"+food);
    }

    private void killHuman() {
        System.out.println("killHuman a poor guy...");
    }
}

public final class HumanTest extends Animals{
    public String name;
    private boolean married;
    HumanTest() {

    }

    public HumanTest(String name, boolean married) {
        this.name = name;
        this.married = married;
    }

    public HumanTest(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    public void eat(String food) {
        System.out.println(name+"is now sating"+food);
    }

    public void study(String course) {
        System.out.println(name+"is now studying " +course);
    }

    private void killAnimsls(String animal) {
        System.out.println(name+"is now killing" + animal);
    }
}
