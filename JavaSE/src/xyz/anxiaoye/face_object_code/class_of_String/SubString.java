package xyz.anxiaoye.face_object_code.class_of_String;

/**
 * 字符串的截取方法：
 * public String subString(int index);截取从参数位置到字符串末尾，返回新字符串
 * public String subString(int begin, int end);截取从 [begin,end) 内的字符串
 */
public class SubString {
    public static void main(String[] args) {
        String str1 = "AnnXiaoye";
        String str2 = str1.substring( 5 );
        System.out.println( str1 );
        System.out.println( str2 );

        String str3 = str1.substring( 3, 9 );
        System.out.println( str3 );
        System.out.println("-------------------------------");
        /**
         * 下面这种写法，字符串的内容仍然是没有改变的
         * 2个字符串，"Hello"，"Java"
         * staA当中报错的是地址值
         * 本来地址是Hello的0x666
         * 后来地址是Java的0x999
         */
        String strA="Hello";
        System.out.println(strA);
        strA="Java";
        System.out.println(strA);
    }
}
