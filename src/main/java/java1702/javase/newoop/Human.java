package java1702.javase.newoop;


/**
 * Created by 高伟冬 on 2017/4/1.
 * javaSE_2
 * 8:58
 * 星期六
 */
public class Human {
    private String name;
    private char genher;
    private int age;
    private double height;
    private double weight;


    public Human(String name, char genher, int age, double height, double weight) {
        this.name = name;
        this.genher = genher;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void study() {

    }

    public void work() {

    }

    public void eat(int i) {

    }

    public int sleep(boolean isPlayGame) {
        if (isPlayGame) {
            return 1;
        }
        return 7;

    }

    public static void main(String[] args) {
        Human human = new Human("tom", 'm', 18, 1.8, 65);
        System.out.println(human.age);
        System.out.println(human.genher);
        System.out.println(human.height);
        System.out.println(human.weight);
        System.out.println(human.name);

    }


}
