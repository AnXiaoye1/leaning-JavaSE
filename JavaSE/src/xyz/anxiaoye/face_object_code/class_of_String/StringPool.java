package xyz.anxiaoye.face_object_code.class_of_String;

/**
 * @ClassName StringPool
 * 字符串常量池：在程序中直接写上双引号的字符串，就在字符串常量池中。
 * 对于基本类型来说，== 是进行数值比较
 * 对于引用类型来说，== 是进行地址值比较
 */
public class StringPool {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";

        char[] chars={'a','b','c'};
        String str3=new String(chars);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}
