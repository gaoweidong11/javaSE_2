package java1702.javase.newoop;

/**
 * Created by 高伟冬 on 2017/4/5.
 * javaSE_2
 * 11:48
 * 星期三
 */
class SuperClass {

    private int i;


    SuperClass() {
    }
}

class SubClass extends SuperClass {

    private double d;

//    public SubClass() {
//    }

    public void setD() {

    }
}

class Test {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        System.out.println(superClass.toString());
    }
}