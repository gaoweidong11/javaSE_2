package java1702.javase.basic;

import java1702.javase.oop.Abstract;

/**
 * Created by 高伟冬 on 2017/3/25.
 * javaSE_2
 * 8:44
 * 星期六
 */
//创建一个 Animal 动物类，定义三个域和三个方法（要求有实际意义）
public class A1 {
    public static void main(String[] args) {

    }
}

class Animal {
    boolean Carnivorous;//食肉
    String cry;// 叫声
    String name;//名字

    public void eat() {

    }

    public void breed() {

    }

    public void run() {

    }
}
//定义一个 Animal 类的子类 Cat，新增两个域和两个方法（要求有实际意义）
class Cat extends Animal{

    private String color;
    private boolean big;

    public void predation() {

    }

    public void courtship() {

    }
    //在 Cat 类中重写父类 Animal 的三个方法
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void breed() {
        super.breed();
    }

    @Override
    public void run() {
        super.run();
    }
}

//定义接口 Flying 内含 fly 方法，定义接口 Swiming 内含 swim 方法，并用上面的 Cat 类实现这两个接口
interface Flying {
    void fly();
}

interface Swiming {
    void swim();
}

class cat implements Flying, Swiming {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
