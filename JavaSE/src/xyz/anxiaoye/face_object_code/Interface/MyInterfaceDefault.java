package xyz.anxiaoye.face_object_code.Interface;

/**
 * 从JDK8开始，接口中运行定义默认方法
 * public default 返回值类型 方法名称（参数列表）{
 *     方法体
 * }
 *
 * 【注意】接口中的默认方法，可以解决接口升级问题
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //新添加的方法
//    public abstract void methodAbs2();
    //改成默认方法就能解决
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法！");
    }
}
