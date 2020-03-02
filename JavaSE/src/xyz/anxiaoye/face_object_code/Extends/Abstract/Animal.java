package xyz.anxiaoye.face_object_code.Extends.Abstract;

/**
 * @ClassName Animal
 * @Author zhuye
 * @Date 2020/2/2 17:40
 *
 * 抽象方法：就是加上 abstract 关键字，去掉大括号，加上分号
 * 抽象类：抽象方法所在的类一定是抽象类，在class之前加上 abstract
 *
 * 如何使用抽象类和抽象方法
 * 1.不能直接创建 new 抽象对象
 * 2.必须用一个子类来继承抽象父类
 * 3.子类必须覆盖重写抽象父类的所有抽象方法
 * 覆盖重写（实现），去掉抽象方法的abstract关键字，加上方法体和大括号
 * 4.创建子类对象进行使用
 */
public abstract class Animal {
    public abstract void eat();
}
