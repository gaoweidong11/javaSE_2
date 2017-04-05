package java1702.javase.Examination;

/**
 * Created by 高伟冬 on 2017/3/20.
 */
public class DefaultClass {
    private int i ;                 //private
    private boolean b;
    //Alt + Insert   重写
    @Override
    public String toString() {
        return "DefaultClass{" +
                "i=" + 100 +
                ", b=" + b +
                '}';
    }
}

