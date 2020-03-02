package xyz.anxiaoye.face_object_code.class_of_Math;

/**
 * Math数学工具类，提供大量数学相关的静态方法
 * public static double abs(double number);绝对值
 * public static double ceil(double number);向上取整
 * public static double floor(double number);向下取整
 * public static long round(double number);四舍五入
 * Math.PI代表近似的圆周率
 */
public class DemoMath {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println( Math.abs( 12 ) );
        System.out.println( Math.abs( -12 ) );
        System.out.println("---------------------------");

        //向上取整
        System.out.println(Math.ceil( 12.8 ));
        System.out.println("---------------------------");

        //向下取整
        System.out.println(Math.floor( 12.2 ));
        System.out.println("---------------------------");

        //四舍五入
        System.out.println(Math.round( 58.9 ));
        System.out.println(Math.round( 58.2 ));
    }
}
