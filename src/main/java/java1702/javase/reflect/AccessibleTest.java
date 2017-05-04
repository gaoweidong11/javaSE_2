package java1702.javase.reflect;

import java.lang.reflect.Field;

/**
 * Created by 高伟冬 on 2017/5/4.
 * javaSE_2
 * 9:02
 * 星期四
 */
public class AccessibleTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person(29);
        Field age = Class.forName("java1702.javase.reflect.Person").getDeclaredField("age");
        age.setAccessible(true);
        age.setInt(person, age.getInt(person) + 1);
        System.out.println(age.getInt(person));
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}
