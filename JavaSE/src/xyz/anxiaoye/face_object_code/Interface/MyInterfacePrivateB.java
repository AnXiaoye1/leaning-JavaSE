package xyz.anxiaoye.face_object_code.Interface;

public interface MyInterfacePrivateB {
    public default void methodStatic1(){
        System.out.println("静态方法1！");
        methodStaticCommon();
    }
    public default void methodStatic2(){
        System.out.println("静态方法2！");
        methodStaticCommon();
    }
    static void methodStaticCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
