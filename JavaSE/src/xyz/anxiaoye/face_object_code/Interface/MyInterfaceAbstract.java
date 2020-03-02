package xyz.anxiaoye.face_object_code.Interface;

/**
 * 在任何版本的Java中，接口都可以定义抽象方法
 * 格式；
 * public abstract 返回值类型 方法名称（）；
 *
 * 【注意】
 * 1.接口中的抽象方法，修饰符必须是：public abstract
 * 2.这两个修饰符可以选择性的省略
 */
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract void methodAbs();
}
