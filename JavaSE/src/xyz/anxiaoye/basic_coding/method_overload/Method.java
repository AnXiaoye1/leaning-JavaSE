package xyz.anxiaoye.basic_coding.method_overload;

/**
 * @ClassName Method
 * @Author zhuye
 * @Date 2020/1/18 14:38
 * @Version 1.0
 */

/**
 * 方法的定义方式：
 * public static void 方法名称（）{
 *     方法体
 * }
 * 注意：
 * 方法的定义是挨着的，不能在一个方法内部定义另一个方法
 */
public class Method {
    public static void main(String[] args) {
        printShape();
    }

    public static void printShape(){
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
