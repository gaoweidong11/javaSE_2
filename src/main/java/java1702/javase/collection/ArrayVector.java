package java1702.javase.collection;

/**
 * Created by 高伟冬 on 2017/3/30.
 * javaSE_2
 * 14:13
 * 星期四
 */
public class ArrayVector {
    // void add(String element)    0
    // String remove(int index)    0
    // String set(int index, String element)  0
    // String get(int index)       0
    // int size()                  0
    // int capacity()              0

    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int capacity;
    private int size;

    public ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    private ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
        capacity = initialCapacity;
    }

    private void add(String string) {
        if (size == capacity) {
            String[] newStrings = new String[capacity * 2];
            capacity *= 2;
            System.arraycopy(strings, 0, newStrings, 0, strings.length);
            strings = newStrings;
        }
        strings[size] = string;
        size++;
    }

    public String get(int index) {
        if (index >= size) { // Exception
            System.out.println("error.");
            System.exit(0);
        }
        return strings[index];
    }

    private int size() {
        return size;
    }

    private int capacity() {
        return capacity;
    }

    public static void main(String[] args) {

        ArrayVector arrayVector = new ArrayVector(2);
        arrayVector.add("hello");
        arrayVector.add("hi");
        System.out.println(arrayVector.size());
        System.out.println(arrayVector.capacity());
    }

    /*
         |-----10------|
         |----------20----------|
     */
}