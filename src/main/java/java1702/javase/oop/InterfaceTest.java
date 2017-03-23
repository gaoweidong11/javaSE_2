package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/23.
 * javaSE_2
 * 9:15
 * 星期四
 */
public interface InterfaceTest {
   // int ONE = 0;
    double getPerimeter();

    double getarea();


    void m();
}

interface A {
    void a();
}

interface B {
    void b();                                           //？
}

interface C {
    void c();
}

class InterfaceTestImpl implements InterfaceTest,A,B,C {

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getarea() {
        return 0;
    }

    @Override
    public void m() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {
        System.out.println();
    }
}

