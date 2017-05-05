package java1702.javase.reflect.demo;

/**
 * Created by 高伟冬 on 2017/5/5.
 * javaSE_2
 * 9:57
 * 星期五
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ...
        System.out.println("write to floppy...");
    }
}