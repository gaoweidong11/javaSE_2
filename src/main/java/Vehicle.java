/**
 * Created by 高伟冬 on 2017/3/15.
 */
public class Vehicle {

     int speed;//速度
     String kind;
     String color;//颜色



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Vehicle(){
        this.setSpeed(20);  //设定速度
        this.setKind("自行车");
        this.setColor("红");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("颜色："+v.getKind()+"    类型："+v.getKind()+"    速度："+v.getSpeed());
        v.setColor("黄");
        v.setKind("汽车");
        v.setSpeed(60);
        System.out.println("颜色："+v.getKind()+"    类型："+v.getKind()+"    速度："+v.getSpeed());
    }


}
