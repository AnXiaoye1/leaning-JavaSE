package xyz.anxiaoye.face_object_code.polymorphic;

/**
 * 多态：父类引用指向子类对象
 * 格式:
 * 类名 对象名=new 类名（）；
 * 接口名 对象名=new 实现类名称（）；
 *
 * 在多态代码中，访问成员变量的方式：
 * 1.直接通过对象名称访问：等号左边是谁，优先用谁，没有则向上找
 * 2.间接通过成员方法访问：看方法属于谁，优先用谁，没有则向上找
 *
 * 在多态中访问成员方法的规则：
 * 看new的是谁，则优先用谁，没有则向上找
 * 【注意】编译看左边，运行看右边
 */
public class DemoPolymorphic {
    public static void main(String[] args) {
        //使用多态的写法
        //左边的父类引用，指向右边的子类对象
        Fu obj=new Zi();
        System.out.println(obj.num);
        //子类没有覆盖重写，就是父类
        //子类覆盖重写，就是子类
        obj.shouNum();

        obj.method();//父子都有，new的是子类，则优先用子类
        obj.methodFu();//子类没有，向上找到父类有
        //编译看左，左边是Fu，父类中没有methodZi（）方法，编译不通过
//        obj.methodZi();//错误写法
    }
}
