package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/17.
 */
// 定义一个学生类,包含三个属性(学号,姓名,成绩)均为私有的
// 分别给这三个属性定义两个方法,一个设置它的值,另一个获得它的值
// 然后在一个测试类里试着调用
public class Oop5 {
    public static void main(String[] args) {
        Student student = new Student("s2017001", "Tom", 80);
        System.out.println(student.getNumber());
        System.out.println(student.getName());
        System.out.println(student.getGrade());
    }
}

class Student {
    private String number;
    private String name;
    private int grade;

    public Student(String number, String name, int grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }


}