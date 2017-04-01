package java1702.javase.collection;
import java.util.*;
/**
 * Created by 高伟冬 on 2017/3/31.
 * javaSE_2
 * 11:43
 * 星期五
 */
public class LietTest {
    public static void main(String[] args){
//        Iterable 可迭代的
//        Collection 集合
//        List 列表
//        Set 集合
//        Map 映射
//        Vector

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hello");//add   增加
        System.out.println(arrayList.size()); //大小

        System.out.println(arrayList.contains("hello"));//包含   布尔类型
        System.out.println(arrayList.indexOf("hello"));//第一次出现的地方
        System.out.println(arrayList.lastIndexOf("hello"));//最后一次出现的地方
        System.out.println(arrayList.remove(1));//删除
        System.out.println(arrayList.set(1, "test")); //集合
        System.out.println(arrayList.isEmpty());//若是空阵则为真 若是空矩阵则为真 测试是否已被初始化  布尔类型
        arrayList.clear();//清除
        System.out.println("--->" + arrayList);//数组列表
    }
}


