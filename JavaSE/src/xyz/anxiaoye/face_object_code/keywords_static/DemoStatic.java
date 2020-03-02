package xyz.anxiaoye.face_object_code.keywords_static;

/**
 * 静态代码块的格式：
 * public class 类名 {
 *     static {
 *         代码块内容
 *     }
 * }
 * 【特点】
 * 当第一次来到本类时，静态代码块执行唯一的一次
 * 静态内容总是优先于非静态内容，所以静态方法先于构造方法
 * 静态代码块的典型用途：用于一次性的对静态变量赋值
 */
public class DemoStatic {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
