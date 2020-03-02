package xyz.anxiaoye.face_object_code.class_of_String;

/**
 * == 是进行对象的地址值比较，如果确实需要字符串的内容比较，可用2个方法
 *
 * public boolean equals(Object obj);参数可用是任何对象，只有参数是一个字符串并且内容相同的才会给true,否则false
 * 【注意】
 * 1.任何对象都能用Object进行接收
 * 2.equals方法具有对称性，a.equals(b)和b.equals(a)效果一样
 * 3.如果比较双方一个常量一个变量，推荐把常量写在前面
 *
 * public boolean equalsIgnoreCase(String str);忽略大小写，进行内容比较
 */
public class StringEquals {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] chars={'H','e','l','l','o'};
        String str3=new String(chars);

        System.out.println(str1.equals( str2 ));
        System.out.println(str2.equals( str2 ));
        System.out.println(str3.equals( "Hello" ));

        String str4="hello";
        System.out.println(str1.equals( str4 ));
        System.out.println("=======================");

        String str5=null;
        System.out.println("abc".equals( str5 ));//推荐，false
//        System.out.println(str5.equals( "abc" ));//不推荐，报错，空指针异常NullPointExpansion

        System.out.println("================");
        String strA="java";
        String strB="Java";
        System.out.println(strA.equals( strB ));//false
        System.out.println(strB.equalsIgnoreCase( strA ));//true

    }
}
