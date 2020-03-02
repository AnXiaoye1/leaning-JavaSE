package xyz.anxiaoye.face_object_code.keywords_static;

/**
 * @ClassName Person
 */
public class Person {
    static {
        System.out.println("静态方法执行！");
    }
    public Person(){
        System.out.println("构造方法执行！");
    }
}
