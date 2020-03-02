package xyz.anxiaoye.basic_coding.method_overload;

/**
 * @ClassName JudgeNumberSame
 * @Author zhuye
 * @Date 2020/1/18 16:23
 */
public class JudgeNumberSame {
    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        System.out.println(isSame( a,b ));
        System.out.println(isSame( (short)20,(short)20 ));
        System.out.println(isSame( 29,29 ));
        System.out.println(isSame( 66L,68L ));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte类型参数的方法执行");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }
    public static boolean isSame(short a, short b) {
        System.out.println("两个short类型参数的方法执行");
        boolean same = a == b ? true : false;

        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int类型参数的方法执行");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isSame(long a, long b) {
        System.out.println("两个long类型参数的方法执行");
        return a == b;
    }
}
