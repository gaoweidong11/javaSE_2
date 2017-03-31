package java1702.javase.collection;

/**
 * Created by 高伟冬 on 2017/3/31.
 * javaSE_2
 * 10:55
 * 星期五
 */
public class ArrayDome {  // 使用数组来模拟一个向量 DynamicArray
    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int capacity;//容量
    private int size;//大小

    public ArrayDome() {
        strings = new String[DEFAULT_CAPACITY]; //新建
        capacity = DEFAULT_CAPACITY;
    }

    public ArrayDome(int initialCapacity) {
        strings = new String[initialCapacity];//新建初始容量
        capacity = initialCapacity;
    }

    public void add(String string) {
        if (size == capacity) {
            String[] newStrings = new String[capacity * 2];
            capacity *= 2;
            System.arraycopy(strings, 0, newStrings, 0, strings.length);//arraycopy  使用
            strings = newStrings;
        }
        strings[size] = string;
        size++;
    }

    public String get(int index) {
        if (index >= size) {                       // Exception  异常
            System.out.println("error.");//error   错误
            System.exit(0);   //exit   退出
        }
        return strings[index];  //index   索引     return    返回
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public String remove(int index) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        String s = strings[index];
        //系统.  使用  （srcPos  销售点    length     长度）
        System.arraycopy(strings, index + 1, strings, index, size - index - 1);
        strings[size - 1] = null;
        size--;
        return s;
    }

    public String set(int index, String element) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        String s = strings[index];
        strings[index] = element;
        return s;
    }
}

