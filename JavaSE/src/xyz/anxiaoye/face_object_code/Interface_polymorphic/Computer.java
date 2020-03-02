package xyz.anxiaoye.face_object_code.Interface_polymorphic;

/**
 * @ClassName Computer
 * @Author zhuye
 * @Date 2020/2/5 22:00
 * @Version 1.0
 */
public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    public void useDevice(USB usb){
        usb.open();//打开设备
        //使用设备
        if (usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard) usb;
            keyboard.type();
        }
        usb.close();//关闭设备
    }
}
