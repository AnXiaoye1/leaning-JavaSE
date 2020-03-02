package xyz.anxiaoye.new_characteristics_of_Java.boxing_unboxing;

/**
 * @ClassName BoxingUnboxing
 * Create by zhuye on 2020/2/22.
 * 基本类型与字符串之间的转换
 */
public class BoxingUnboxing {
    public static void main(String[] args) {
        //基本类型-->字符串
        int i=100;
        String s1=i+"";
        System.out.println(s1+300);

        String s2=Integer.toString( 400 );
        System.out.println(s2+200);

        String s3=String.valueOf( 500 );
        System.out.println(s3+100);

        //字符串-->基本类型
        int j=Integer.parseInt( s1 );
        System.out.println(i-46);
    }
}
