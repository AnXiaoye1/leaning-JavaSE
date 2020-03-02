package xyz.anxiaoye.face_object_code.class_of_Scanner;

import java.util.Scanner;

/**
 * @ClassName DoubleNumSum
 * 输入两个数字并求和
 */
public class DoubleNumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "请输入一个数字：" );
        int a = scanner.nextInt();
        System.out.println( "请再输入一个数字：" );
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println( "结果是：" + sum );

    }
}

