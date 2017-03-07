/**
 * Created by 高伟冬 on 2017/3/7.
 */
public class CharTest {
    public static void main(String[] args) {
        char c = 123;
        System.out.println((int)c);//整数    加小括号  强制转换

        char c1 = 'a';
        System.out.println(c1);//单个字符

        char c2 = '\324';
        System.out.println(c2);//3位八进制字符

        char c3 = '\u4e00';
        System.out.println(c3);//4位十六位字符

        char c4 = '\t';
        System.out.println(c4);//标签

        char c5 = '\b';
        System.out.println(c5);//退格键

        char c6 = '\n';
        System.out.println(c6);//换行符

        char c7 = '\r';
        System.out.println(c7);//回车

        char c8 = '\f';
        System.out.println(c8); //换页

        char c9 = '\'';
        System.out.println(c9);//单引号字符

        char a = '\"';
        System.out.println(a);//双引号字符

        char a1 = '\\';
        System.out.println(a1);//一个反斜线字符

    }
}
