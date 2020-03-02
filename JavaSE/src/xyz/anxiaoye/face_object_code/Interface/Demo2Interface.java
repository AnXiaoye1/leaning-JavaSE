package xyz.anxiaoye.face_object_code.Interface;

/**
 * @ClassName Demo2Interface
 * @Author zhuye
 * @Date 2020/2/4 16:40
 * @Version 1.0
 */
public class Demo2Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a=new MyInterfaceDefaultA();
        a.methodAbs();//调用的抽象方法，实际运行的是右边的实现类
        a.methodDefault();//调用默认方法，如果实现类中没有，就向上找接口
        System.out.println("==================");

        MyInterfaceDefaultB b=new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
