package java1702.javase.reflect.demo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by 高伟冬 on 2017/5/5.
 * javaSE_2
 * 11:35
 * 星期五
 */
public class PropertiesTest {

    // properties 属性\ ['prɒpətɪz]

    public static void main(String[] args) throws IOException, FileNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/java1702/javase/reflect/demo1/config.properties"));
        System.out.println(properties.getProperty("key"));
        System.out.println(properties.getProperty("k"));
    }
}
