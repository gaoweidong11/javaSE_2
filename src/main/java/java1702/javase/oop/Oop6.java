package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/18.
 */
// 创建一个汽车类 Car,为其定义两个属性:颜色和型号
// 为该类创建两个构造方法: 第一个为无形参的构造方法,利用其中方法将颜色和型号设置为红色、轿车
// 第二个为带参构造方法,利用构造方法将颜色和型号设置为黑色、轿车
// 另外为该类创建两个方法,分别用来显示颜色和型号
public class Oop6 {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.getColor());
        System.out.println(car1.getType());

        Car car2 = new Car("黑色", "轿车");
        System.out.println(car2.getColor());
        System.out.println(car2.getType());
    }
}

class Car {
    private String color;
    private String type;

    public Car() {
        color = "红色";
        type = "轿车";
    }

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
