package xyz.anxiaoye.face_object_code.Extends;

/**
 * 当局部变量，子类的成员变量，父类的成员变量重名时，如何访问
 * 局部变量------直接访问成员变量名
 * 子类成员变量--this.子类成员变量名
 * 父类成员变量--super.父类成员变量名
 *
 * 在父子类关系中，创建了子类对象，访问成员方法的规则：
 *  创建的对象是谁，就优先用谁，没有则向上找
 *
 * 重写（Override）：在继承关系中，方法的名称一样，参数列表【一样】。
 *      特点：创建的子类对象是谁，则优先用谁。即new的是谁就用谁
 * 重载（Overload）：方法名称一样，参数列表【不一样】。
 *
 * 在继承关系中，父子类构造方法的访问特点
 * 1.子类构造方法中有一个默认隐含的“super()”方法调用,所以一定是先执行父类构造，再执行子类
 * 2.子类可以利用 super 关键字来调用父类重载的构造方法
 * 3.super 的父类构造调用，必须是子类构造方法的第一个语句，不能子类构造调用多次super构造
 */
public class ExtendsFiled {
    public static void main(String[] args) {
        Zi zi=new Zi();
        System.out.println("======================");
        zi.method();
        System.out.println("======================");
        zi.methodFu();
        zi.methodZi();
        zi.Method();
    }
}
