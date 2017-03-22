package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/22.
 * javaSE_2
 * 9:06
 * 星期三
 */
public class Static {
    public static void main(String[] args) {
        Tset tset = new Tset();
        tset.age = 17;
        tset.mankind = false;
        tset.name = "tom";
        System.out.println(tset.age);
        System.out.println(tset.name);
        System.out.println(tset.mankind);

        System.out.println("--------------");

        tset.mankind = true;
        tset.name = "Jerry";
        tset.age = 18;
        System.out.println(tset.mankind);
        System.out.println(tset.age);
        System.out.println(tset.name);

}

static class Tset {
    private int age;
    private String name;
    private static boolean mankind;
/*
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMankind() {
        return mankind;
    }

    public void setMankind(boolean mankind) {
        this.mankind = mankind;
    }*/

}
}