package java1702.javase.basic;

/**
 * Created by 高伟冬 on 2017/3/17.
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        System.out.println(calculatorTest.add(1.3,1.6));
        System.out.println(calculatorTest.add(1,2));
        System.out.println(calculatorTest.add(1,2,3));
    }
}

class CalculatorTest {
    public double add(double x, double y ) {
        return x + y;
    }
    public int add(int x, int y) {
        return x + y;
    }
    public  double add(double x, int y) {
        return x + y;
    }
    public double add(int y, double x) {
        return y + x;
    }
    public double add(double a ,double b,double c) {
        return a + b + c;
    }
}
