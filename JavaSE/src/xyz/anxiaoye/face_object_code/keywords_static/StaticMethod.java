package xyz.anxiaoye.face_object_code.keywords_static;

/**
 * 一旦使用static修饰成员方法，那么这个方法就是静态方法，静态方法不属于对象，而是属于类。
 * 如果没有static修饰的方法，要创建对象才能调用。
 * 如果有static修饰的方法，通过类名调用。
 * <p>
 * 无论是成员变量还是成员方法，有static修饰，推荐用类名调用
 * 静态变量：类名.成员变量
 * 静态方法：类名.成员方法（）
 * 【注意】
 * 1.静态变量不能访问非静态变量
 * 原因：【先】有的静态变量，【后】有的非静态变量
 * 2.静态方法中不能用 this
 * 原因：this代表当前对象，通过谁调用的方法，谁就是当前对象
 */
public class StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        //创建对象，通过对象调用没有static修饰的方法
        obj.method();
        //通过类名直接调用static修饰的方法
        MyClass.staticMethod();
        //对于自己类的静态方法，可以省去类名调用
        method();
    }

    public static void method() {
        System.out.println( "自己类的静态方法。" );
    }
}
