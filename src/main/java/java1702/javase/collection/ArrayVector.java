package java1702.javase.collection;

/**
 * Created by 高伟冬 on 2017/3/30.
 * javaSE_2
 * 14:13
 * 星期四
 */
public class ArrayVector {
    // void add(String element)
    // String remove(int index)
    // String set(int index, String element)
    // String get(int index)
    // int size()
    // int capacity()

    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int size;

    private ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
    }

    private void add(String string) {
        strings[size] = string;
        size++;
    }

    private String get(int index) {
        return strings[index];
    }

    public static void main(String[] args) {
        ArrayVector arrayVector = new ArrayVector();
        arrayVector.add("hello");
        arrayVector.add("hi");
        System.out.println(arrayVector.get(0)); // hello
        System.out.println(arrayVector.get(1)); // hi
    }
}