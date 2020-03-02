package xyz.anxiaoye.face_object_code.polymorphic;

/**
 * 向上转型是安全的，正确的
 * 弊端：一旦向上转型为父类，就无法调用子类原有的特有内容
 *
 * 解决方法：用对象的向下转型，还原回去
 */
public class DemoMain {
    public static void main(String[] args) {
        //向上转型为父类
        Animal animal=new Cat();
        animal.eat();
        //向下转型，进行【还原】动作
        Cat cat=(Cat)animal;
        cat.catchMouse();
        //错误的转型，编译不会报错，但运行会异常：java.lang.ClassCastException
//        Dog dog = (Dog)animal;
    }
}
