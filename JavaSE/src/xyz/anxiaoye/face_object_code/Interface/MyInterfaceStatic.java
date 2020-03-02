package xyz.anxiaoye.face_object_code.Interface;

/**
 * 从JDK8开始，接口中运行定义静态方法
 * public default 返回值类型 方法名称（参数列表）{
 *     方法体
 * }
 */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是接口实现的静态方法！");
    }
}

