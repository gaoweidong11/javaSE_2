package java1702.javase.kaishi;

import java.io.*;
import java.util.Scanner;

/**
 * Created by 高伟冬 on 2017/5/6.
 * javaSE_2
 * 15:08
 * 星期六
 */
/*
* 用输入/输出写一个程序,让用户输入一些姓名和电话号码。
* 每一个姓名和号码将加在文件 里。用户通过点”Done”按钮来告诉系统整个列表已输入完毕。
* 如果用户输入完整个列表, 程序将创建一个输出文件并显示或打印出来。格式如:
Tom
123-456-7890
Jerry
987-654-3210
* */
public class E163 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream outs = new ObjectOutputStream(new FileOutputStream("D:/bbs.txt"));
        Scanner sc = new Scanner(System.in);
        ObjectInputStream ins = new ObjectInputStream(new FileInputStream("D:/bbs.txt"));
        System.out.println("学生信息录入(输入Done退出录入)：");
        while (true) {
            Student stu = new Student();
            System.out.println("请输入姓名：");
            stu.setName(sc.next());
            if ("Done".equals(stu.getName()) || "done".equals(stu.getName())) {
                System.out.println("退出学生信息录入！");
                break;
            }
            System.out.println("请输入电话号码：");
            stu.setNumber(sc.next());
            if ("Done".equals(stu.getNumber()) || "done".equals(stu.getNumber())) {
                System.out.println("退出学生信息录入！");
                break;
            }
            outs.writeObject(stu);
        }
        Student stu = new Student();
        System.out.println("学生信息输出：");
        while (true) {
            try {
                stu = (Student) ins.readObject();
                System.out.println(stu.toString());
            } catch (EOFException e) {
                break;
            }
        }
    }
}

class Student implements Serializable {
    private String name;
    private String number;

    Student() {
    }

    Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return number + "," + name;//格式如：555-1212,Tom
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getNumber() {
        return number;
    }

    void setNumber(String number) {
        this.number = number;
    }
}
