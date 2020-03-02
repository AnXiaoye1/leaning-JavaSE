package xyz.anxiaoye.face_object_code.Interface;

/**
 * 接口就是多个类的公共规范
 * 接口是一种引用类型数据，最重要的内容是其中的：抽象方法
 *
 * 定义接口的格式：
 * public interface 接口名称{
 *     接口内容
 * }
 *
 * 【备注】关键字换成 interface之后，编译生成的字节码文件任然是：.java-->.class
 * JDK7包含内容：
 * 1.常量
 * 2.抽象方法
 * JDK8还有：
 * 3.默认方法
 * 4.静态方法
 * JDK9还有：
 * 5.私有方法
 *
 * 接口的使用
 * 1.接口不能直接使用，必须有一个“实现类”来“实现”该接口
 * 格式：
 * public class 实现类名称 implements 接口名称{
 *     //具体
 * }
 * 2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
 * 3.创建实现类的对象，然后使用
 * 【注意】
 * 如果实现类没有覆盖重写接口中的所有抽象方法，那么这个实现类自己必须是抽象类
 */
public class DemoInterface {
    public static void main(String[] args) {
        //创建实现类的对象使用
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.methodAbs();
    }

}
