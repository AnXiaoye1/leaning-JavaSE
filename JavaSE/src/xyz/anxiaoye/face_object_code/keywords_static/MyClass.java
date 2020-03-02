package xyz.anxiaoye.face_object_code.keywords_static;

/**
 * @ClassName MyClass
 */
public class MyClass {
    //成员变量
    int number;
    //静态变量
    static int numberStatic;

    //成员方法
    public void method() {
        System.out.println( "这是一个普通成员方法。" );
        //成员方法可以访问成员变量
        System.out.println(number);
        //成员方法可以访问静态变量
        System.out.println(numberStatic);
    }

    //静态方法
    public static void staticMethod() {
        System.out.println( "这是一个静态方法。" );
        //静态方法可以访问静态变量
        System.out.println(numberStatic);
        //静态方法不可以直接访问成员变量
        //System.out.println(number);

    }
}
