package java1702.javase.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 高伟冬 on 2017/4/27.
 * javaSE_2
 * 8:48
 * 星期四
 */
public class Test {
    public static void main(String[] args) {
//        Pattern 模式
//        Matcher 匹配
        System.out.println(Pattern.CASE_INSENSITIVE);
        Pattern pattern = Pattern.compile("l",Pattern.CASE_INSENSITIVE);//compile  编译
        Matcher matcher = pattern.matcher("hello world");  //方法尝试将整个输入序列与该模式匹配

//        System.out.println(matcher.find());   //find 查找  方法扫描输入序列以查找与该模式匹配的下一个子序列。
        while (matcher.find()) {
            System.out.println(matcher.group());//group 团体
        }
    }
}
