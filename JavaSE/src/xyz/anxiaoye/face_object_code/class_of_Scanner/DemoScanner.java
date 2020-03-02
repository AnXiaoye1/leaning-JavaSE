package xyz.anxiaoye.face_object_code.class_of_Scanner;

import java.util.Scanner; //1.导包

/**
 * @ClassName DemoScanner
 * Scanner类可以实现从键盘输入数据到程序
 * 引用类型的一般使用步骤：
 * 1.导包
 * 只有Java.lang包下的类不需要导包，其余的都要
 * 2.创建
 * 3.使用
 */
public class DemoScanner {
    public static void main(String[] args) {
        //2.创建
        //System.in 表示从键盘输入
        Scanner scanner = new Scanner( System.in );

        //3.获取键盘输入的int数据
        int age = scanner.nextInt();
        System.out.println( "输入的年龄是：" + age );
        //4.获取输入的字符串
        String name = scanner.next();
        System.out.println( "输入的姓名是：" + name );
    }
}
