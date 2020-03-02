package xyz.anxiaoye.face_object_code.class_and_object;

/**
 * @ClassName Student 学生类
 * @Author zhuye
 * @Date 2020/1/19 22:23
 * 成员变量：属性（是什么）：【定义在类中方法外】
 * 姓名、年龄
 * 成员方法【没有static】：行为（做什么）：
 * 吃饭、睡觉、学习
 * 通常类不能直接使用，需要根据类创建一个对象，才能使用
 * 导包：指出类的位置【同一个类中不用】，用import
 * 创建：类名称 对象名=new 类名称()；
 * 使用：分两种情况
 * 使用成员变量：对象名.成员变量
 * 使用成员方法：对象名.成员方法
 */
public class Student {
    String name;
    int age;

    public void study() {
        System.out.println( "学习习" );
    }

    public void sleep() {
        System.out.println( "睡觉觉" );
    }

    public void eat() {
        System.out.println( "吃饭饭" );
    }
}
