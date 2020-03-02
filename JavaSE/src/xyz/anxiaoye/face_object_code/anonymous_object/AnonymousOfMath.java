package xyz.anxiaoye.face_object_code.anonymous_object;

import java.util.Scanner;

/**
 * @ClassName AnonymousOfMath
 * @Author zhuye
 * 匿名对象作为方法的参数
 */
public class AnonymousOfMath {
    public static void main(String[] args) {
        //普通使用方式
        System.out.println( "普通使用方式" );
        Scanner scanner = new Scanner( System.in );
        int number = scanner.nextInt();
        System.out.println( "输入的数字是：" + number );
        //匿名对象的方式
        System.out.println( "匿名对象的方式" );
        int num = new Scanner( System.in ).nextInt();
        System.out.println( "输入的数字是：" + num );
        System.out.println("------------一般方式传参----------");
        //使用一般方式传参
        methodParam( scanner );
        System.out.println("----------匿名对象方式传参--------");
        //使用匿名对象方式传参
        methodParam( new Scanner( System.in ) );

    }

    /**
     * 匿名对象做参数，也可做返回值
     * @param scanner
     */
    public static void methodParam(Scanner scanner){
        int number=scanner.nextInt();
        System.out.println("输入的数是："+number);
    }
}
