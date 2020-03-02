package xyz.anxiaoye.basic_coding.method_overload;

/**
 * @ClassName MethodOverload
 * @Author zhuye
 * @Date 2020/1/18 15:55
 */

/**
 * 功能相似，只是参数形式或个数不同时，使用方法重载
 * 方法重载（overload）：多个方法名称一样，只是参数列表不同
 * 即：1.参数个数不同
 *     2.参数类型不同
 *     3.参数多类型顺序不同
 */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum( 10,20 ));
        System.out.println(sum( 15.4,23 ));
        System.out.println(sum( 15,23.8 ));
        System.out.println(sum( 10,20 ,30));
        System.out.println(sum( 10,20 ,30,40));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(double a,int b){
        return (int )(a+b);
    }
    public static int sum(int a,double b){
        return (int )(a+b);
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
