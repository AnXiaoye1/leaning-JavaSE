package xyz.anxiaoye.face_object_code.Interface_polymorphic;

/**
 * @ClassName Mouse
 * @Author zhuye
 * @Date 2020/2/5 22:04
 * @Version 1.0
 */
public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
