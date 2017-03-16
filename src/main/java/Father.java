/**
 * Created by 高伟冬 on 2017/3/16.
 */
public class Father {//类
        int money;//域

        public  void coding() {          //super class   base class  父类  超类  基类
            System.out.println("Father is coding....");
            //类的默认构造方法
        }
    }

class Son extends Father {    //sub class  子类         extends = 继承 /扩展
//类的默认构造方法
}

class ExtendsTest {
    public static void main(String[] args) {//主方法
        Father father = new Father();     //new   调用类的默认构造方法   有参无参 都可调用。
        System.out.println(father.money);//输出域
        father.coding();                  //输出方法

        Son son = new Son();
        System.out.println(son.money);
        son.coding();
    }
}