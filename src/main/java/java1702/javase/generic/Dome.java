package java1702.javase.generic;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.misc.PostVMInitHook;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created by 高伟冬 on 2017/4/18.
 * javaSE_2
 * 10:06
 * 星期二
 */
public class Dome {
    private static void method() throws NullPointerException {
        try {
            System.out.println("e");
            throw new FileNotFoundException();
//            System.out.println("f");
        } catch (Exception e) {
            System.out.println("g");
        }finally {
            System.out.println("h");
        }
        System.out.println("i");
    }

    public static void main(String[] args) {
        try {
            method();
            System.out.println("a");
        } catch (NullPointerException e) {
            System.out.println("b");
        }finally {
            System.out.println("c");
        }
        System.out.println("d");
    }
}
