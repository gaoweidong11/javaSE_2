package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/18.
 */
// 编写一个立方体类,包含这样的属性:长度、宽度、高度等信息,通过方法来 计算它的体积
public class Oop2 {
    public static void main(String[] args) {
        Cube cube = new Cube(1d, 2d, 3d);
        System.out.println(cube.getVolume());
    }
}

class Cube {
    double length;
    private double width;
    private double height;

    Cube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume() {
        return  length * width * height;
    }
}

