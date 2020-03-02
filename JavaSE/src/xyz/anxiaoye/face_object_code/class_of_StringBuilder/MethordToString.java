package xyz.anxiaoye.face_object_code.class_of_StringBuilder;

/**
 * @ClassName MethordToString
 * Create by zhuye on 2020/2/21.
 * StringBuilder和String的转换：
 *     StringBuilder-->String：可以使用StringBuilder的构造方法
 *          StringBuilder(String str)
 *     String-->StringBuilder：可以使用StringBuilder的toString方法
 *          public String toString();
 */
public class MethordToString {
    public static void main(String[] args) {
        //String-->StringBuilder
        String str="Hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder( str );
        bu.append( "World" );
        System.out.println("bu:"+bu);//对象

        //StringBuilder-->String
        String s = bu.toString();
        System.out.println("s:"+s);//字符串
    }
}
