package xyz.anxiaoye.face_object_code.class_and_object;

/**
 * @ClassName VariableDifference 成员变量和局部变量对比
 * 1.定义位置不一样：
 *   局部变量：在方法的内部
 *   成员变量：在放个外部，类中
 * 2.作用范围不一样：
 *   局部变量：只有在方法中使用，出了方法不可以
 *   成员变量：整个类中使用
 * 3.默认值不一样：
 *   局部变量：没有默认值，若要使用，必须手动赋 值
 *   成员变量：未赋值，有默认值，同数组
 * 4.内存位置不一样：
 *   局部变量：位于栈内存
 *   成员变量：位于堆内存
 * 5.生命周期不一样：
 *   局部变量：随着方法进栈而生，随着方法出栈而消失
 *   成员变量：随着对象创建而生，随着对象被垃圾回收而消失
 * @Author zhuye
 * @Date 2020/1/20 1:06
 * @Version 1.0
 */
public class VariableDifference {
    String name;//成员变量
    public void methodA(){
        int num=10;//局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int age){//方法的参数就是局部变量
        //参数在方法调用的时候，比如会被赋值的
        System.out.println(age);
        System.out.println(name);
    }
}
