package xyz.anxiaoye.face_object_code.class_of_String;

/**
 * 分割字符串的方法：
 * public String[] split(String regex);按照参数的规则，将字符串切分为若干份
 *
 * 【注意】
 * split方法的参数其实是一个正则表达式
 * 如果按照英文句点“.”进行切分，必须写“\\.”（两个反斜杠）
 */
public class StringSplit {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc,d";
        //按照 逗号 分割
        String[] array1=str1.split( "," );
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("-----------------------------");
        String str2="aaa bbb ccc";
        String[] array2 = str2.split( " " );
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("-----------------------------");
        String str3="xxx.yyy.zzz";

        String[] array3=str3.split( "\\." );
        System.out.println(array3.length);//0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
