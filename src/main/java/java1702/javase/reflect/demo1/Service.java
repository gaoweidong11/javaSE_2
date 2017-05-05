package java1702.javase.reflect.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by 高伟冬 on 2017/5/5.
 * javaSE_2
 * 11:37
 * 星期五
 */
public class Service {
    public void write() throws Exception {
        Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/java/java1702/javase/reflect/demo1/config.properties"));
        String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");

            Class clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod(methodName);
            Constructor constructor = clazz.getDeclaredConstructor();
            method.invoke(constructor.newInstance());
    }
}
