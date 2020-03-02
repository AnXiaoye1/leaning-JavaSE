package xyz.anxiaoye.face_object_code.class_of_Scanner;

import java.util.Scanner;

/**
 * @ClassName MaxOfThree
 * 输入三个数，输出最大值
 */
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "输入第一个数：" );
        int a = scanner.nextInt();
        System.out.println( "输入第二个数：" );
        int b = scanner.nextInt();
        System.out.println( "输入第三个数：" );
        int c = scanner.nextInt();
        int temp = a > b ? a : b;
        int result = temp > c ? temp : c;
        System.out.println("结果是："+result);
    }
}
