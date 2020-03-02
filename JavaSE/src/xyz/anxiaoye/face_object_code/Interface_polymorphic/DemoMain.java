package xyz.anxiaoye.face_object_code.Interface_polymorphic;

/**
 * 主要是为了熟悉接口的使用
 * 实现类对象的向上/向下转型
 * 多态
 */
public class DemoMain {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();
        //准备一个鼠标给电脑用
//        Mouse mouse=new Mouse();
        //首先向上转型
        USB usbMouse= new Mouse();//多态写法
        computer.useDevice( usbMouse );

        //创建一个键盘，没有使用多态
        Keyboard keyboard=new Keyboard();
        //参数是USB接口类型，但现在是实现类对象【实现类对象可以自动向上转型为接口】
        computer.useDevice( keyboard );//正确写法，发生了向上转型
        //使用你们对象，也是正确的
        computer.useDevice( new Keyboard() );
        computer.powerOff();
    }
}
