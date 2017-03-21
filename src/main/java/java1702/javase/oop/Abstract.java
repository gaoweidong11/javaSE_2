package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/21.
 * javaSE_2
 * 8:55
 * 星期二
 */
//  类   =  域   +  方法
 //class = field + method
public abstract class Abstract {
    //abstract  抽象的
    private int i ;

    public abstract void method1();

    public abstract void method2();

    public abstract void method();  //modifier 修饰符


    public void method3() {

    }

    SudAbstractTest sudAbstractTest = new SudAbstractTest();


}

class SudAbstractTest extends Abstract {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    //
    @Override
    public void method() {
        System.out.println("in SudAbstractTest");
    }
}
