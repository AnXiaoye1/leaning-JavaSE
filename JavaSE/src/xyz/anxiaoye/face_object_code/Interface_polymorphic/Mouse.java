package xyz.anxiaoye.face_object_code.Interface_polymorphic;

/**
 * @ClassName Mouse
 * @Author zhuye
 * @Date 2020/2/5 22:04
 * @Version 1.0
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
