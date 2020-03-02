package xyz.anxiaoye.face_object_code.keywords_final;

/**
 * final关键字代表最终，不可以改变的。
 *
 * >  常见四种用法：
 *
 * - 可以修饰一个类
 * - 可以修饰一个方法
 * - 可以修饰一个局部变量
 * - 可以修饰一个成员变量
 */
public class Final {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num);
        num=20;
        System.out.println(num);

        //final修饰的变量，一旦赋值不能更改
        final int number=100;
        System.out.println(number);
    }
}
