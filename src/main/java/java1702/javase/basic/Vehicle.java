package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/15.
 */
public class Vehicle {
    String name;
    double weight;
    double price;
    char color;

    public Vehicle(String name, double weight, double peice, char color) {
        this.name = name;
        this.weight = weight;
        this.price = peice;
        this.color = color;
    }

    public Vehicle() {
        System.out.println("....wa........");
    }

    public void start() {
        System.out.println("Vehicle is starting");

    }
    public void stop() {
        System.out.println("Vehicle is stopped");

    }
}

class Bicycle extends Vehicle {//自行车
    int wheel;//轮

    public Bicycle() {
        super();//this 指代当前类    super   指代超类     调用超类的构造方法
        //super.start(); 调用超类的成员方法
    }

    public void Single() {  //单人
        System.out.println("Riding alone");
    }
}

class Ship extends Vehicle {  //船
    String Loading;//载物

    public void water() {   //水里
        System.out.println("Ships can be in the water");
    }

}

class Plane extends Vehicle {   //飞机
    int speed;//     km/h    速度

        public void flight() {   //飞行
            System.out.println("Plane flight");
        }
}

class VehicleTest {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.name);
       vehicle.start();
        System.out.println(vehicle.weight);
        vehicle.stop();
        System.out.println(vehicle.color);
        System.out.println(vehicle.price);

        System.out.println("---------------------------");

        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.name);
        bicycle.start();
        System.out.println(bicycle.wheel);
        System.out.println(bicycle.color);
        System.out.println(bicycle.price);
        bicycle.Single();
        bicycle.stop();

        System.out.println("----------------------------------");

        Ship ship = new Ship();
        System.out.println(ship.Loading);
        System.out.println(ship.price);
        System.out.println(ship.name);
        System.out.println(ship.weight);
        ship.water();
        ship.stop();
        ship.start();

        System.out.println("-------------------------------");

        Plane plane = new Plane();
        System.out.println(plane.speed);
        System.out.println(plane.weight);
        System.out.println(plane.name);
        System.out.println(plane.price);
        System.out.println(plane.color);
        plane.flight();
        plane.start();
        plane.stop();
    }

}