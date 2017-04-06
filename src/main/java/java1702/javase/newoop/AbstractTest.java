package java1702.javase.newoop;

/**
 * Created by 高伟冬 on 2017/4/6.
 * javaSE_2
 * 8:53
 * 星期四
 */
public abstract class AbstractTest {
    private int i;

    public abstract void m();

    public AbstractTest(int i) {
        this.i = i;
    }

    public abstract void m(String a, boolean b);

    public static void main(String[] args) {
//        AbstractTest abstractTest = new AbstractTest()
          AubAbstractTest aubAbstractTest  = new AubAbstractTest(1);
        System.out.println(aubAbstractTest);
    }
}

class AubAbstractTest extends AbstractTest {

    public AubAbstractTest(int i) {
        super(i);
    }

    @Override
    public void m() {

    }

    @Override
    public void m(String a, boolean b) {

    }
}
