package xyz.anxiaoye.basic_coding.method_overload;

/**
 * @ClassName MethodDefined
 * @Author zhuye
 * @Date 2020/1/18 14:46
 * @Version 1.0
 */

/**
 * 方法是若干语句的功能集合
 * 参数（原料）：传进方法的数据
 * 返回值（产品）：传出方法的数据（格式与方法定义的格式一致）
 * <p>
 * return ：两个作用：1.停止当前方法；2.将后面的返回值传给调用处
 * 方法的三种调用：
 * 1.单独调用：方法名称（参数）；无返回值的方法只能用此方式
 * 2.打印调用：将方法放在打印语句中
 * 3.赋值调用：
 */
public class MethodDefined {
    public static void main(String[] args) {
        sum( 8, 29 );
        System.out.println( "------------------------------" );
        System.out.println( sum( 3, 5 ) );
        System.out.println( "------------------------------" );
        int result = sum( 3, 8 );
        System.out.println( result );
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
