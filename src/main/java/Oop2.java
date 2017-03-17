/**
 * Created by 高伟冬 on 2017/3/16.
 */
//	编写一个立方体类，包含这样的属性：长度、宽度、高度等信息，通过方法来 计算它的体积
public class Oop2 {
    public static void main(String[] args) {
        Cube cude = new Cube(1d,2d,3d);
        System.out.println(cude.getVolume());
    }
}

class Cube {
    double length;
    double width;
    double height;

    public Cube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }
}

