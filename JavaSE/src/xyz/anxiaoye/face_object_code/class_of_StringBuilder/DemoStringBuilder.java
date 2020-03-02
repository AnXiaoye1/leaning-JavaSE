package xyz.anxiaoye.face_object_code.class_of_StringBuilder;

/**
 * @ClassName DemoStringBuilder
 * Create by zhuye on 2020/2/21.
 * java.lang.StringBuilder; 字符串缓冲区，加快字符串的使用效率
 * 构造方法：
 *     StringBuilder() 构造一个其中不带字符的字符串生成器，初始容量为 16 个字符。
 *     StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 */
public class DemoStringBuilder {
    public static void main(String[] args) {
        //空参构造方法
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1:"+sb1);

        //带字符串的构造方法
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("sb2:"+sb2);
    }
}

