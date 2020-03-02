package xyz.anxiaoye.face_object_code.keywords_final;

/**
 * final修饰一个类，表示这个类没有子类，即final修饰的类不能作父类，且其所有的方法都不能覆盖重写
 */
public final class MyClass {
    public void method(){
        System.out.println("方法执行");
    }
}
