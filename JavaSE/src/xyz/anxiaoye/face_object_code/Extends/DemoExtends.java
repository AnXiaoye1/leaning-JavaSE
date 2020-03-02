package xyz.anxiaoye.face_object_code.Extends;

/**
 * 在继承关系中，子类就是一个父类，就是说子类可以当成父类用
 * 定义父类的格式（就是一个普通的类）
 * public class 父类名称{
 *     成员变量
 *     成员方法
 * }
 * 定义子类的格式
 * public class 子类名称 extends 父类名称{
 *     子类特有的成员变量及方法
 * }
 *
 * 在父子的继承关系中，如果成员变量重名，则创建子类对象时，访问方式有两种
 * 直接通过子类对象访问：等号左边是谁，就优先用谁，没有则向上找
 * 间接通过成员方法访问成员变量：该方法属于（定义在）谁，则用谁，没有向上找
 */
public class DemoExtends {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.method();
    }
}
