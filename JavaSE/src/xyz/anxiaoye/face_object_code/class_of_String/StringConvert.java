package xyz.anxiaoye.face_object_code.class_of_String;

/**
 * String当中与转换相关的常用方法：
 * public char[] toCharArray();将当前字符串拆分成字符数组作为返回值
 * public byte[] getBytes();获得当前字符串底层的字节数组
 * public String replace(CharSequence oldString,charSequence newString);
 * 将所有出现的老字符串替换成新的字符串，返回替换后的新字符串
 * 【备注】CharSequence意思是说可用接收字符串类型
 */
public class StringConvert {
    public static void main(String[] args) {
        //转换为字符数组
        char[] chars="Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("-------------------------------");

        //转换为字节数组 , IO流更常用
        byte[] bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("-------------------------------");

        //字符串的内容替换【游戏中过滤不良语言】
        String str1="How do you do?";
        String str2=str1.replace( "o","*" );
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("-------------------------------");

        String lang1="会不会玩啊！你个龟孙儿！你个龟孙儿！你个龟孙儿！！！";
        String lang2=lang1.replace( "龟孙儿","***" );
        System.out.println(lang2);
    }
}
