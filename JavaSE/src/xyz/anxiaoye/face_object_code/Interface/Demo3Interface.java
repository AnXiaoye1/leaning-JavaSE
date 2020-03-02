package xyz.anxiaoye.face_object_code.Interface;

/**
 * 【注意】不能通过接口实现类的对象来调用接口中的静态方法
 * 直接通过接口名称调用
 */
public class Demo3Interface {
    public static void main(String[] args) {
        //调用接口中的静态方法
        MyInterfaceStatic.methodStatic();
    }
}
