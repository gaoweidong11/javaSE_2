package java1702.javase.Examination;

/**
 * Created by 高伟冬 on 2017/3/21.
 * javaSE_2
 * 10:05
 * 星期二
 */
public abstract class Shape {

    public abstract double getPerimeter();

    public abstract double getArea();

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Trapezoid trapezoid = new Trapezoid(3,4,5);
        System.out.println(trapezoid.getPerimeter());
        System.out.println(trapezoid.getArea());

    }


}

class Rectangle extends Shape {

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    private double length;

    private double wide;

    @Override
    public double getPerimeter() {
        return (length + wide)* 2;
    }

    @Override
    public double getArea() {
        return length * wide;
    }
}

class Trapezoid extends Shape {

    private int high;
    private  int up;
    private int below;

    public Trapezoid(int high, int up, int below) {
        this.high = high;
        this.up = up;
        this.below = below;
    }

    @Override
    public double getPerimeter() {
        return high * up * below;
    }

    @Override
    public double getArea() {
        return high + up + below;
    }
}
