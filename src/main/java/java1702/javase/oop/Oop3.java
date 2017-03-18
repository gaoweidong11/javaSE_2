package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/18.
 */
// 定义一个人类,包含姓名、性别、年龄等信息
// 所有的域必须私有
// 其他类只能通过该类的方法获取和修改
// 实例化一个人类,试着通过该类的方法修改实例化的人的信息
public class Oop3 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getName());
        person.setName("Tom");
        System.out.println(person.getName());
        person.setGender('F');
        System.out.println(person.getGender());
    }
}

class Person {
    private String name;
    private char gender;
    private int age;

    public Person() {
    }

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Person(String name) {

        this.name = name;
    }

    //    setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}