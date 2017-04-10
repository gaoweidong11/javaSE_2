package java1702.javase.kaishi;

/**
 * Created by 高伟冬 on 2017/4/8.
 * javaSE_2
 * 15:02
 * 星期六
 */
//   按以下要求编写程序
//(1) 编写 Animal 接口，接口中声明 eat() 方法
//(2) 定义Bird类和 Fish 类实现 Animal 接口,Bird 中还有
// flying 方法，Fish 中还有 swimming 方法，分别实现这些方法
//(3) 编写 Bird 类和 Fish 类的测试程序，并调用其中的各个方法
public class T5 {
    // Animal 接口
    public interface Animal {
        public void run();
    }

    //Bird类
    public class Bird implements Animal {
        @Override
        public void run() {
            System.out.println("小鸟");
        }
    }

    //Fish类
    public class Fish implements Animal {
        @Override
        public void run() {
            System.out.println("小鱼");
        }
    }

    //测试类
    public class AnimalTest {
        public void main(String[] args) {
            Animal b = new Animal() {
                @Override
                public void run() {

                }
            };
            Animal f = new Fish();
            b.run();
            f.run();
        }
    }
}
