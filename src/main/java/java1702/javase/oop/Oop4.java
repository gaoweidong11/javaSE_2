package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/18.
 */
// 将圆周率定义为常量,编写一个求圆面积的方法,调用此方法来求圆的面积
public class Oop4 {
    public static void main(String[] args) {
        Circle circle = new Circle(1.23);
        System.out.println(circle.getArea());
    }
}

class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
