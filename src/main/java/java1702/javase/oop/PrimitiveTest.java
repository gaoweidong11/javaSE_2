package java1702.javase.oop;

/**
 * Created by 高伟冬 on 2017/3/17.
 */
public class PrimitiveTest {

     Byte s;

    // java.lang.String FQN             JDK   String(字符串)  为引用数据类型
    private static void method(PrimitiveTest primitiveTest) { // 引用传递
        System.out.println("a: " + primitiveTest.s); // hello
        primitiveTest.s = Byte.valueOf("hi");
        System.out.println("b: " + primitiveTest.s); // hi
    }

    public static void main(String[] args) {
        PrimitiveTest primitiveTest = new PrimitiveTest();          //    主要用于 传递参数的地址(也就是值传递)
        primitiveTest.s = Byte.valueOf("hello"); // 0
        System.out.println("c: " + primitiveTest.s); // hello
        method(primitiveTest);
        System.out.println("d: " + primitiveTest.s); // hello
    }
}
/*
    java.lang
            boolean - Boolean
            byte - Byte
            char - Character*
            short - Short
            int - Integer*
            long - Long
            float - Float
            double - Double
 */
