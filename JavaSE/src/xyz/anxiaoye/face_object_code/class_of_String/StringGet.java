package xyz.anxiaoye.face_object_code.class_of_String;

/**
 * String 当中与获取相关的常用方法
 *
 * public int length();获取字符串中的字符个数
 * public String concat(String str);将当前字符串和参数字符串拼接成为返回值，新的字符串
 * public char charAt(int index);获取指定索引位置的单个字符
 * public int indexOf(String str);查找参数字符串在本字符串当中首次出现的索引位置，若没有返回-1
 *
 */
public class StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "lsdfowjfookfiawefifjlfhuiaejfaof".length();
        System.out.println("字符串的长度是："+ length);
        System.out.println("----------------------------------");
        //拼接字符串
        String str1="Hello";
        String str2="World";
        String str3=str1.concat( str2 );
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("----------------------------------");

        //获取指定索引位置的单个字符
        char ch = "hello world!".charAt( 6 );
        System.out.println("在6号索引位置的字符是："+ ch);
        System.out.println("----------------------------------");

        //查找参数字符串在原来字符串中出现第一次的索引位置,没有则返回-1
        String original="AnnXiaoye";
        int index=original.indexOf( "Xiao" );
        System.out.println("第一次索引值是："+ index);
    }
}
