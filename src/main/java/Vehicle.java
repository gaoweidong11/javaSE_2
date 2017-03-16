import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by 高伟冬 on 2017/3/15.
 */
public class Vehicle {
    String name;
    double weight;
    double peice;
    char color;

    public void start() {
        System.out.println("Vehicle is starting");

    }
    public void stop() {
        System.out.println("Vehicle is stopped");

    }
}

class Bicycle extends Vehicle {//自行车
    int wheel;//轮

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

        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.name);
        bicycle.start();

        Ship ship = new Ship();
        System.out.println(ship.Loading);
        ship.water();

        Plane plane = new Plane();
        System.out.println(plane.speed);
        plane.flight();

    }

}