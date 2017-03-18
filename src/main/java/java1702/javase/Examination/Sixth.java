package java1702.javase.Examination;

/**
 * Created by 高伟冬 on 2017/3/18.
 */
//编写一个人类 Person,其中包含姓名、性别和年龄的属性,包含构造方法以及显示姓名、性别和年龄的方法。
//再编写一个学生类 Student,它继承 Person 类,其中包含学号属性,包含构造方法以及显示学号的方法。
//最后编写一个主类 Test,包含 main 方法, 在 main 方法中定义两个学生 s1 和 s2 并给他们赋值,
//最后显示他们的学号、姓名、性别以及年龄。
public class Sixth {
    public static void main(String[] args) {
        Person s1 = new Person("张三","男",18);
        Student s2 = new Student("李四","女",17,2345);
        System.out.println(s1.name);
        System.out.println(s1.sex);
        System.out.println(s1.age);
        System.out.println("--------------------------------");
        System.out.println(s2.sex);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.StudentID);
    }
}

class Person {
    String name;
    String sex;
    int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}

class Student extends Person {
    int StudentID;

    public Student(String name, String sex, int age, int studentID) {
        super(name, sex, age);
        StudentID = studentID;
    }
}
